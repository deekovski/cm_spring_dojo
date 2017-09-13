package cm.ps.springdojo;


import cm.ps.springdojo.config.SpringDojoApplication;
import cm.ps.springdojo.service.FooService;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDojoApplication.class)
public class FooServiceTest implements ApplicationContextAware{

    @SuppressWarnings("unused")
    private ApplicationContext applicationContext;

    @Autowired
    FooService fooService;

    @Test
    public void shouldReturnMessage() {
        assertThat(fooService.getMessage()).isEqualTo("message");
    }

    @Override
    @SneakyThrows(BeansException.class)
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
