package ab.tjl.ad.dao.unit_condition;

import ab.tjl.ad.entity.unit_condition.AdUnitKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:TangJiLin
 * @Description:广告单元关键字限制 持久层接口
 * @Date: Created in 2020/4/12 21:44
 * @Modified By:
 */
public interface AdUnitKeywordRepository extends JpaRepository<AdUnitKeyword, Long> {
}
