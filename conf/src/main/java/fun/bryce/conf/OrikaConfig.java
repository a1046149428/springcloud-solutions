package fun.bryce.conf;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bryce
 * @date 2019/6/30 7:16
 */
@Configuration
public class OrikaConfig
{

    @Bean
    public MapperFactory getFactory()
    {
        return new DefaultMapperFactory.Builder().build();
    }
}
