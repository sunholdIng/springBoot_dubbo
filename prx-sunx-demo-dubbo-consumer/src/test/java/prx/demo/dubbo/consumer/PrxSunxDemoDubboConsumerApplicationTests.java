package prx.demo.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import prx.sunx.dubbo.serviceApi.DemoService;

//@ImportResource("classpath:dubbo/dubbo-*.xml")
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrxSunxDemoDubboConsumerApplicationTests {
	@Reference
	private DemoService dubboService;

	@Test
	public void contextLoads() {
		System.out.println(dubboService.sayHello("hello"));
		System.out.print("ok");
	}

}
