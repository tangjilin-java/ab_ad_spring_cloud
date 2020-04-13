package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:TangJiLin
 * @Description: 广告推广单元响应数据封装
 * @Date: Created in 2020/4/13 14:51
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitResponse {

    private Long id;
    private String unitName;
}
