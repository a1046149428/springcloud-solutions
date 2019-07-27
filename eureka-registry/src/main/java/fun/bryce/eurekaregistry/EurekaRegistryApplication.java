package fun.bryce.eurekaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegistryApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaRegistryApplication.class, args);
    }

}
