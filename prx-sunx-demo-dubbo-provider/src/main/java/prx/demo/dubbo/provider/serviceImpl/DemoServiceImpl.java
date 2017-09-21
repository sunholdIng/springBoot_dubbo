package prx.demo.dubbo.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import prx.sunx.dubbo.serviceApi.DemoService;

/**
 * <p>
 * Created by sunx on 2017/9/19.
 * Description:
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return name;
    }
}
