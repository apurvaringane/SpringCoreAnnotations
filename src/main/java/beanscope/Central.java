package beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("central1")
@Scope("prototype")
public class Central {
    void display(){
        System.out.println("DISPLAY METHOD");
    }
}
