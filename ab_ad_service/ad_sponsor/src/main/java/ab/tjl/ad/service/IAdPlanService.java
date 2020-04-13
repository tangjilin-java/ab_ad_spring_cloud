package ab.tjl.ad.service;

import ab.tjl.ad.entity.AdPlan;
import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.vo.AdPlanGetRequest;
import ab.tjl.ad.vo.AdPlanRequest;
import ab.tjl.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 广告推广计划业务层接口
 * @Date: Created in 2020/4/13 10:15
 * @Modified By:
 */
public interface IAdPlanService {
    /**
     * 创建广告推广计划
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 批量获取广告推广计划
     * @param request
     * @return
     * @throws AdException
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * 更新广告推广计划
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 删除广告推广计划
     * @param request
     * @throws AdException
     */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
