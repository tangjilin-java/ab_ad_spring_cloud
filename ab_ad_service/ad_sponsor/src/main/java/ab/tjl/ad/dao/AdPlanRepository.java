package ab.tjl.ad.dao;

import ab.tjl.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 广告计划持久层接口
 * @Date: Created in 2020/4/12 21:29
 * @Modified By:
 */
public interface AdPlanRepository extends JpaRepository<AdPlan,Long> {

    /**
     * 通过id和用户id查找记录
     * @param id
     * @param userId
     * @return
     */
    AdPlan findByIdAndUserId(Long id,Long userId);

    /**
     * 通过id和用户id查找所有记录
     * @param ids
     * @param userId
     * @return
     */
    List<AdPlan> findAllByIdAndUserId(List<Long> ids,Long userId);

    /**
     * 通过用户id和计划名查找计划
     * @param userId
     * @param planName
     * @return
     */
    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    /**
     * 通过计划状态查找所有计划
     * @param planStatus
     * @return
     */
    List<AdPlan> findAllByPlanStatus(Integer planStatus);
}
