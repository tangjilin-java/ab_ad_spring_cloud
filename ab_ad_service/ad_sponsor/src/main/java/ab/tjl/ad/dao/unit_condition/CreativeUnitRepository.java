package ab.tjl.ad.dao.unit_condition;

import ab.tjl.ad.entity.unit_condition.CreativeUnit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:TangJiLin
 * @Description:广告创意单元关联  持久层接口
 * @Date: Created in 2020/4/12 21:44
 * @Modified By:
 */
public interface CreativeUnitRepository extends JpaRepository<CreativeUnit, Long> {
}
