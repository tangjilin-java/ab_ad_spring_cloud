package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @Author:TangJiLin
 * @Description:广告推广计划请求数据封装
 * @Date: Created in 2020/4/13 10:16
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanRequest {

    private Long id;
    private Long userId;
    private String planName;
    private String startDate;
    private String endDate;

    /**
     * 创建时验证
     * @return
     */
    public boolean createValidate(){
        return userId != null
                && !StringUtils.isEmpty(planName)
                && !StringUtils.isEmpty(startDate)
                && !StringUtils.isEmpty(endDate);
    }

    /**
     * 更新时验证
     * @return
     */
    public boolean updateValidate(){
        return id != null && userId != null;
    }

    /**
     * 删除时验证
     * @return
     */
    public boolean deleteValidate(){
        return id != null && userId != null;
    }
}
