package iocannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Mobile m1=c1.getBean("m1",FeaturedPhone.class);
        m1.getType();
        m1.getSpecifications();

        System.out.println("================================");

        Mobile m2=c1.getBean("smartPhone",SmartPhone.class);
        m2.getType();
        m2.getSpecifications();
    }
}
