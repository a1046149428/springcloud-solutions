package fun.bryce.mybatistest;

import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("fun.bryce.mybatistest.mapper")
public class MybatisTestApplication
{
    @Bean
  //  @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
    public static void main(String[] args)
    {
        SpringApplication.run(MybatisTestApplication.class, args);
    }

}
