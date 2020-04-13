package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:TangJiLin
 * @Description:广告推广计划响应数据封装
 * @Date: Created in 2020/4/13 10:16
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdPlanResponse {

    private Long id;
    private String planName;
}
