package fun.bryce.log4j2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Log4j2Application
{

    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Log4j2Application.class);
        app.addListeners( new ApplicationStartedEventListener());
        app.run(args);

    }

}
