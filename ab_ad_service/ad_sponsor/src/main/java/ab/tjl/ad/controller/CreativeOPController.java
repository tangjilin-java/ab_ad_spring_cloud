package ab.tjl.ad.controller;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.service.ICreativeService;
import ab.tjl.ad.vo.CreativeRequest;
import ab.tjl.ad.vo.CreativeResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:TangJiLin
 * @Description: 广告创意控制层
 * @Date: Created in 2020/4/13 18:10
 * @Modified By:
 */
@Slf4j
@RestController
public class CreativeOPController {
    @Autowired
    private ICreativeService creativeService;

    /**
     * 创建广告创意
     * @param request
     * @return
     */
    @PostMapping("/create/creative")
    public CreativeResponse createCreative(@RequestBody CreativeRequest request)throws AdException {
        log.info("ad-sponsor: createCreative -> {}", JSON.toJSONString(request));
        return creativeService.createCreative(request);
    }
}
