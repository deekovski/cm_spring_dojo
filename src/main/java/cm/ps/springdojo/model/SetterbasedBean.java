package cm.ps.springdojo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class SetterbasedBean {
    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;
    private String attr5;

    public SetterbasedBean(String attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }
}
