package beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        Master ref1=c1.getBean("master1", Master.class);
        ref1.test();


        Master ref2=c1.getBean("master1", Master.class);
        ref2.test();
        System.out.println(ref1==ref2);
        System.out.println(ref1+"\t\t"+ref2);
        System.out.println("==============================");

        Central ref3=c1.getBean("central1", Central.class);
        ref3.display();

        Central ref4=c1.getBean("central1", Central.class);
        ref4.display();

        System.out.println(ref3==ref4);
        System.out.println(ref3+"\t\t"+ref4);
    }
}
