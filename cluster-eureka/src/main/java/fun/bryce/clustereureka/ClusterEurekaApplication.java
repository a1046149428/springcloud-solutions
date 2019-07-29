package fun.bryce.clustereureka;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cherb
 */
@SpringBootApplication
@EnableEurekaServer
@EnableSwagger2Doc
public class ClusterEurekaApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ClusterEurekaApplication.class, args);
    }

}
