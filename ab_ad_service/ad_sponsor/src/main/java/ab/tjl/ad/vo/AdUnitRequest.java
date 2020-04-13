package ab.tjl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * @Author:TangJiLin
 * @Description: 广告推广单元请求数据封装
 * @Date: Created in 2020/4/13 14:51
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {

    private Long planId;
    private String unitName;

    private Integer positionType;
    private Long budget;

    /**
     * 创建时校验
     * @return
     */
    public boolean createValidate() {
        return null != planId && !StringUtils.isEmpty(unitName) && positionType != null && budget != null;
    }
}
