package cm.ps.springdojo.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class PrototypeBean {
    private String timeStamp;
    private String message;

    public static PrototypeBean createInstance(String message) {
        return new PrototypeBean(message);
    }

    public PrototypeBean(String message) {
        this.message = message;
        this.timeStamp = new Timestamp(System.currentTimeMillis()).toString();
    }
}
