package ab.tjl.ad.utils;

import ab.tjl.ad.exception.AdException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;

import java.util.Date;

/**
 * @Author:TangJiLin
 * @Description:公共工具类：  1.MD5加密 2.字符串转换成时间格式 3. 4.....
 * @Date: Created in 2020/4/13 10:10
 * @Modified By:
 */
public class CommonUtils {
    private static String[] parsePatterns = {
      "yyyy-MM-dd","yyyy/MM/dd","yyyy.MM.dd"
    };
    /**
     * md5加密
     * @param value
     * @return
     */
    public static  String md5(String value){
        return DigestUtils.md5Hex(value).toUpperCase();
    }

    /**
     * 字符串转换成时间格式
     * @param dateString
     * @return
     */
    public static Date parseStringDate(String dateString) throws AdException {
        try {
            return DateUtils.parseDate(dateString,parsePatterns);
        }catch (Exception e){
            throw new AdException(e.getMessage());
        }
    }
}
