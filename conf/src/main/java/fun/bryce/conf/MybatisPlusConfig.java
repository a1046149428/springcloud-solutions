package fun.bryce.conf;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author bryce
 * 2019/6/28 11:17
 */
@EnableTransactionManagement
@Configuration
@ConditionalOnMissingBean(name = "mybatisPlusConfig")
public class MybatisPlusConfig
{

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor()
    {
        return new PaginationInterceptor();
    }
}
