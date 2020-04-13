package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 广告推广单元地域限制条件响应数据封装
 * @Date: Created in 2020/4/13 15:05
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitDistrictResponse {

    private List<Long> ids;
}
