package ab.tjl.ad.dao;

import ab.tjl.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:TangJiLin
 * @Description: 广告创意持久层接口
 * @Date: Created in 2020/4/12 21:40
 * @Modified By:
 */
public interface CreativeRepository extends JpaRepository<Creative,Long> {


}
