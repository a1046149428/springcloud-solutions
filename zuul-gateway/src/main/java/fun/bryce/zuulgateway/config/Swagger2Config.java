package fun.bryce.zuulgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author bryce
 * 2019/7/29 17:28
 */

@Configuration
@EnableSwagger2
public class Swagger2Config
{
    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("fun.bryce.zuulgateway")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo()
    {
        Contact contact = new Contact("Bryce    ", "http://www.bryce-huang.fun/", "cherbini@qq.com");
        return new ApiInfo("ZuulGateway", "", "v1.0.0", "", contact, "", "", new ArrayList<>());
    }

}