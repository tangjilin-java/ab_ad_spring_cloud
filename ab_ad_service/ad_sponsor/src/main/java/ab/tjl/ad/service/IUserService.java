package ab.tjl.ad.service;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.vo.CreateUserRequest;
import ab.tjl.ad.vo.CreateUserResponse;

/**
 * @Author:TangJiLin
 * @Description: 用户业务层接口
 * @Date: Created in 2020/4/13 9:56
 * @Modified By:
 */
public interface IUserService {
    /**
     * 创建用户
     * @param request
     * @return
     * @throws AdException
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
