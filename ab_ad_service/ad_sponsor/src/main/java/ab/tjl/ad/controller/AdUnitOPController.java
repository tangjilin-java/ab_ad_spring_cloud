package ab.tjl.ad.controller;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.service.IAdUnitService;
import ab.tjl.ad.vo.*;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:TangJiLin
 * @Description: 广告推广单元控制层
 * @Date: Created in 2020/4/13 17:51
 * @Modified By:
 */
@Slf4j
@RestController
public class AdUnitOPController {

    @Autowired
    private IAdUnitService adUnitService;

    /**
     * 创建广告推广单元
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/adUnit")
    public AdUnitResponse createUnit(
            @RequestBody AdUnitRequest request) throws AdException {
        log.info("ad-sponsor: createUnit -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnit(request);
    }

    /**
     * 创建广告推广单元关键字限制条件
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/unitKeyword")
    public AdUnitKeywordResponse createUnitKeyword(
            @RequestBody AdUnitKeywordRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitKeyword -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnitKeyword(request);
    }

    /**
     * 创建广告推广兴趣限制条件
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/unitIt")
    public AdUnitItResponse createUnitIt(
            @RequestBody AdUnitItRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitIt -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnitIt(request);
    }

    /**
     * 创建广告推广地域限制条件
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/unitDistrict")
    public AdUnitDistrictResponse createUnitDistrict(
            @RequestBody AdUnitDistrictRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitDistrict -> {}",
                JSON.toJSONString(request));
        return adUnitService.createUnitDistrict(request);
    }

    /**
     * 创建广告推广创意单元关联
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/creativeUnit")
    public CreativeUnitResponse createCreativeUnit(
            @RequestBody CreativeUnitRequest request
    ) throws AdException {
        log.info("ad-sponsor: createCreativeUnit -> {}",
                JSON.toJSONString(request));
        return adUnitService.createCreativeUnit(request);
    }
}
