package cm.ps.springdojo;


import cm.ps.springdojo.config.SpringDojoApplication;
import cm.ps.springdojo.service.FuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDojoApplication.class)
public class FuServiceTest {

    @Autowired
    FuService fuService;

    @Test
    public void shouldReturnMessage() {
        assertThat(fuService.getMessage()).isNotNull();
    }
}
