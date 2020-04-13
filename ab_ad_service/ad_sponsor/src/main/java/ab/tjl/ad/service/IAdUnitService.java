package ab.tjl.ad.service;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.vo.*;

/**
 * @Author:TangJiLin
 * @Description: 广告推广单元业务层接口
 * @Date: Created in 2020/4/13 14:51
 * @Modified By:
 */
public interface IAdUnitService {

    /**
     * 创建广告推广单元
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    /**
     * 创建关键字限制
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
            throws AdException;

    /**
     * 创建兴趣限制
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitItResponse createUnitIt(AdUnitItRequest request)
            throws AdException;

    /**
     * 创建地域限制
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
            throws AdException;

    /**
     * 创建创意关联推广单元
     * @param request
     * @return
     * @throws AdException
     */
    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
            throws AdException;
}