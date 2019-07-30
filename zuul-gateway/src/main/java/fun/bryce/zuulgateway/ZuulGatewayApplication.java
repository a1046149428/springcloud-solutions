package fun.bryce.zuulgateway;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.post.LocationRewriteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableSwagger2Doc
@EnableOAuth2Sso
public class ZuulGatewayApplication extends WebSecurityConfigurerAdapter
{
    /**
     * 避免 browser redirects to the web application’s URL instead of the Zuul URL
     *
     * @return
     */
    @Bean
    public LocationRewriteFilter locationRewriteFilter()

    {
        return new LocationRewriteFilter();
    }

    @Bean
    public CorsFilter corsFilter()
    {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        //        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);

    }
    //    @Bean
    //    public WebMvcConfigurer corsConfigurer() {
    //        return new WebMvcConfigurer() {
    //            public void addCorsMappings(CorsRegistry registry) {
    //                registry.addMapping("*")
    //                        .allowedOrigins("https://allowed-origin.com")
    //                        .allowedMethods("GET", "POST");
    //            }
    //        };
    //    }

    public static void main(String[] args)
    {
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }

}
