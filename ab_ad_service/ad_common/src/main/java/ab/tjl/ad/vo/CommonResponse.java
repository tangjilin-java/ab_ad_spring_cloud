package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author:TangJiLin
 * @Description: 统一响应数据处理
 * @Date: Created in 2020/4/12 16:19
 * @Modified By:
 */
@Data
@NoArgsConstructor//无参构造函数
@AllArgsConstructor//全参构造函数
public class CommonResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResponse(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
