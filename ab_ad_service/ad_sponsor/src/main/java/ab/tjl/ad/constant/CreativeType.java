package ab.tjl.ad.constant;

import lombok.Getter;

/**
 * @Author:TangJiLin
 * @Description:广告创意类型枚举类常量
 * @Date: Created in 2020/4/12 21:17
 * @Modified By:
 */
@Getter
public enum  CreativeType {

    IMAGE(1,"图片"),
    VIDEO(2,"视频"),
    TEXT(3,"文本");

    private int type;
    private String desc;

    CreativeType(int type , String desc){
        this.type = type;
        this.desc = desc;
    }
}
