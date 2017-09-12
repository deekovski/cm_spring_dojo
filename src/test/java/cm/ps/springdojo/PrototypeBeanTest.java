package cm.ps.springdojo;

import cm.ps.springdojo.config.SpringDojoApplication;
import cm.ps.springdojo.model.PrototypeBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDojoApplication.class)
public class PrototypeBeanTest implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Test
    public void testPrototype() throws InterruptedException {
        PrototypeBean bean1 =  (PrototypeBean) applicationContext.getBean("prototypeBean");
        System.out.println("bean 1 created on: " + bean1.getTimeStamp());

        Thread.sleep(2000L);

        PrototypeBean bean2 =  (PrototypeBean) applicationContext.getBean("prototypeBean");
        System.out.println("bean 1 created on: " + bean2.getTimeStamp());

        assertThat(bean1.getTimeStamp()).isNotEqualTo(bean2.getTimeStamp());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
