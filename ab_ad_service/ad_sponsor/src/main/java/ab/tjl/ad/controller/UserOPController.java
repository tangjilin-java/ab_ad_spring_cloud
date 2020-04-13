package ab.tjl.ad.controller;

import ab.tjl.ad.exception.AdException;
import ab.tjl.ad.service.IUserService;
import ab.tjl.ad.vo.CreateUserRequest;
import ab.tjl.ad.vo.CreateUserResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:TangJiLin
 * @Description: 用户控制层
 * @Date: Created in 2020/4/13 16:04
 * @Modified By:
 */
@Slf4j
@RestController
public class UserOPController {

    @Autowired
    private IUserService userService;

    /**
     * 创建用户
     * @param request
     * @return
     * @throws AdException
     */
    @PostMapping("/create/user")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) throws AdException{
        log.info("ad_sponsor: createUser -> {}", JSON.toJSONString(request));
        return userService.createUser(request);
    }

}
