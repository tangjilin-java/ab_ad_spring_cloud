package ab.tjl.ad.dao.unit_condition;

import ab.tjl.ad.entity.unit_condition.AdUnitDistrict;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:TangJiLin
 * @Description:广告单元地域限制 持久层接口
 * @Date: Created in 2020/4/12 21:44
 * @Modified By:
 */
public interface AdUnitDistrictRepository extends JpaRepository<AdUnitDistrict, Long> {
}
