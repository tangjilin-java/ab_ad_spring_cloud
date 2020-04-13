package ab.tjl.ad.dao;

import ab.tjl.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 广告单元持久层接口
 * @Date: Created in 2020/4/12 21:37
 * @Modified By:
 */
public interface AdUnitRepository extends JpaRepository<AdUnit,Long> {

    /**
     * 根据计划id和单元名称查找广告单元
     * @param planId
     * @param unitName
     * @return
     */
    AdUnit findByPlanIdAndUnitName(Long planId,String unitName);

    /**
     * 根据单元状态查找所有广告单元
     * @param unitStatus
     * @return
     */
    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
