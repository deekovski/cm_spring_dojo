package cm.ps.springdojo;


import cm.ps.springdojo.config.SpringDojoApplication;
import cm.ps.springdojo.model.SetterbasedBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDojoApplication.class)
public class SetterbasedBeanTest {

    @Autowired
    SetterbasedBean setterbasedBean;

    @Test
    public void testSetterbasedBean() {
        assertThat(setterbasedBean.getAttr1()).isEqualTo("val1");
        assertThat(setterbasedBean.getAttr2()).isEqualTo("val2");
        assertThat(setterbasedBean.getAttr3()).isEqualTo("val3");
        assertThat(setterbasedBean.getAttr4()).isEqualTo("val4");
        assertThat(setterbasedBean.getAttr5()).isEqualTo("val5");
    }
}
