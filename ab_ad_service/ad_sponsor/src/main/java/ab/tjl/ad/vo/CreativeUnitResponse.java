package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 广告创意关联推广单元响应数据封装
 * @Date: Created in 2020/4/13 15:51
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitResponse {

    private List<Long> ids;
}
