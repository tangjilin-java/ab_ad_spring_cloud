package ab.tjl.ad.dao;

import ab.tjl.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:TangJiLin
 * @Description: 广告用户持久层接口
 * @Date: Created in 2020/4/12 21:27
 * @Modified By:
 */
public interface AdUserRepository extends JpaRepository<AdUser,Long> {

    /**
     * 根据用户名查找用户记录
     * @param username
     * @return
     */
    AdUser findByUsername(String username);
}
