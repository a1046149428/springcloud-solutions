package fun.bryce.consumerdemo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@EnableSwagger2Doc
@EnableDiscoveryClient
public class ConsumerDemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }

}
