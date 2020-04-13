package ab.tjl.ad.service.impl;

import ab.tjl.ad.constant.Constants;
import ab.tjl.ad.dao.AdUserRepository;
import ab.tjl.ad.entity.AdUser;
import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.service.IUserService;
import ab.tjl.ad.utils.CommonUtils;
import ab.tjl.ad.vo.CreateUserRequest;
import ab.tjl.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:TangJiLin
 * @Description: 用户业务层接口实现类
 * @Date: Created in 2020/4/13 10:02
 * @Modified By:
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private AdUserRepository userRepository;

    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        if (!request.validate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdUser oldUser = userRepository.findByUsername(request.getUsername());
        if (oldUser != null){
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser newUser = userRepository.save(new AdUser(
           request.getUsername(), CommonUtils.md5(request.getUsername())
        ));

        return new CreateUserResponse(
                newUser.getId(),newUser.getUsername(),newUser.getToken(),newUser.getCreateTime(),newUser.getUpdateTime()
        );
    }
}
