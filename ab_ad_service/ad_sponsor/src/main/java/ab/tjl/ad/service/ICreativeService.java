package ab.tjl.ad.service;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.vo.CreativeRequest;
import ab.tjl.ad.vo.CreativeResponse;

/**
 * @Author:TangJiLin
 * @Description: 创意业务层接口
 * @Date: Created in 2020/4/13 15:39
 * @Modified By:
 */
public interface ICreativeService {

    /**
     * 创建创意
     * @param request
     * @return
     * @throws AdException
     */
    CreativeResponse createCreative(CreativeRequest request) throws AdException;
}
