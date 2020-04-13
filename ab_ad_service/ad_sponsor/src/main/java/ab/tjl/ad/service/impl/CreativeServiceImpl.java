package ab.tjl.ad.service.impl;

import ab.tjl.ad.dao.CreativeRepository;
import ab.tjl.ad.entity.Creative;
import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.service.ICreativeService;
import ab.tjl.ad.vo.CreativeRequest;
import ab.tjl.ad.vo.CreativeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:TangJiLin
 * @Description: 广告创意业务层接口实现类
 * @Date: Created in 2020/4/13 15:41
 * @Modified By:
 */
@Slf4j
@Service
public class CreativeServiceImpl implements ICreativeService {

    @Autowired
    private CreativeRepository creativeRepository;

    /**
     * 创建广告创意
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    public CreativeResponse createCreative(CreativeRequest request) throws AdException {
        Creative creative = creativeRepository.save(request.convertToEntity());
        return new CreativeResponse(creative.getId(),creative.getName());
    }
}
