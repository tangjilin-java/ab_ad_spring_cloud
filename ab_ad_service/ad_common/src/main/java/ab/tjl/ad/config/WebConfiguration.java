package ab.tjl.ad.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Author:TangJiLin
 * @Description: 配置消息转换器
 * @Date: Created in 2020/4/12 16:43
 * @Modified By:
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>>
                                                   converters) {
        converters.clear();//清空转换器
        converters.add(new MappingJackson2HttpMessageConverter());//只用这一个转换器：将java对象转换成json对象
    }
}
