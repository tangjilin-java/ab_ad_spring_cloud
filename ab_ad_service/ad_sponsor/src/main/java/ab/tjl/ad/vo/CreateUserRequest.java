package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @Author:TangJiLin
 * @Description:创建用户请求数据封装
 * @Date: Created in 2020/4/13 9:57
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    private String username;

    public boolean validate(){
        return StringUtils.isEmpty(username);
    }
}
