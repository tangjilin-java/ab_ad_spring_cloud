package ab.tjl.ad.constant;

import lombok.Getter;

/**
 * @Author:TangJiLin
 * @Description:广告创意物料的类型枚举类常量
 * @Date: Created in 2020/4/12 21:21
 * @Modified By:
 */
@Getter
public enum CreativeMetrialType {

    JPG(1,"jpg"),
    BMP(2,"bmp"),

    MP4(3,"mp4"),
    AVI(4,"avi"),

    TXT(5,"txt");

    private int type;
    private String desc;

    CreativeMetrialType(int type,String  desc){
        this.type = type;
        this.desc = desc;
    }
}
