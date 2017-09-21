package prx.demo.dubbo.consumer.servicePro;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import prx.sunx.dubbo.serviceApi.DemoService;

/**
 * <p>
 * Created by sunx on 2017/9/20.
 * Description:
 */
@Service
public class TestDubbo {
    @Reference
    private DemoService demoService;

    public String testDubbo(){

        return demoService.sayHello("success");
    }
}
