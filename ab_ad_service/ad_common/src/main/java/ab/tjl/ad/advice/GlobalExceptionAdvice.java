package ab.tjl.ad.advice;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:TangJiLin
 * @Description:统一异常处理通知
 * @Date: Created in 2020/4/12 16:38
 * @Modified By:
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)//只处理AdException类里面的异常
    public CommonResponse<String> handlerAdException(HttpServletRequest request, AdException ex){
        CommonResponse<String> response = new CommonResponse<>(-1,"business error");
        response.setData(ex.getMessage());
        return response;
    }
}
