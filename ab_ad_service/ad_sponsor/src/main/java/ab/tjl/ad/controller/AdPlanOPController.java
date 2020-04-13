package ab.tjl.ad.controller;

import ab.tjl.ad.entity.AdPlan;
import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.service.IAdPlanService;
import ab.tjl.ad.vo.AdPlanGetRequest;
import ab.tjl.ad.vo.AdPlanRequest;
import ab.tjl.ad.vo.AdPlanResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 广告推广计划控制层
 * @Date: Created in 2020/4/13 16:11
 * @Modified By:
 */
@Slf4j
@RestController
public class AdPlanOPController {

    @Autowired
    private IAdPlanService adPlanService;

    /**
     * 创建广告推广计划
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/adPlan")
    public AdPlanResponse createAdPlan(@RequestBody AdPlanRequest request) throws AdException {
        log.info("ad_sponsor: createAdPlan -> {}", JSON.toJSONString(request));
        return adPlanService.createAdPlan(request);
    }

    /**
     * 通过IDS得到一堆广告推广计划
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/get/adPlan")
    public List<AdPlan> getAdPlanByIds(
            @RequestBody AdPlanGetRequest request) throws AdException {
        log.info("ad-sponsor: getAdPlanByIds -> {}",
                JSON.toJSONString(request));
        return adPlanService.getAdPlanByIds(request);
    }


    /**
     * 更新广告推广计划
     * @param request
     * @return
     * @throws AdException
     */
    @PutMapping("/update/adPlan")
    public AdPlanResponse updateAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
        log.info("ad-sponsor: updateAdPlan -> {}",
                JSON.toJSONString(request));
        return adPlanService.updateAdPlan(request);
    }

    /**
     * 删除广告推广计划
     * @param request
     * @throws AdException
     */
    @DeleteMapping("/delete/adPlan")
    public void deleteAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
        log.info("ad-sponsor: deleteAdPlan -> {}",
                JSON.toJSONString(request));
        adPlanService.deleteAdPlan(request);
    }
}
