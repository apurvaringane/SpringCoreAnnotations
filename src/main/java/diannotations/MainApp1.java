package diannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Laptop laptop=c1.getBean("l1",Laptop.class);
        laptop.getType();
        laptop.getProcessor();
    }
}
