package prx.demo.dubbo.provider.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 浙江卓锐科技有限公司
 * <p>
 * Created by sunx on 2017/9/21.
 * Description:
 */
@Configuration
@PropertySource("classPath:dubbo/dubbo-*")
public class DubboConfig {
}
