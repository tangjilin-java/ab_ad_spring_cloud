package ab.tjl.ad.constant;

import lombok.Getter;

/**
 * @Author:TangJiLin
 * @Description:公共状态枚举类常量
 * @Date: Created in 2020/4/12 20:40
 * @Modified By:
 */
@Getter
public enum CommonStatus {

    VALID(1,"有效状态"),
    INVALID(0,"无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status , String  desc){
        this.status = status;
        this.desc = desc;
    }
}
