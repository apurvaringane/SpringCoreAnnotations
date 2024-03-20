package beanscope;

import org.springframework.stereotype.Component;

@Component("master1")
public class Master {
    void test(){
        System.out.println("TEST METHOD");
    }
}
