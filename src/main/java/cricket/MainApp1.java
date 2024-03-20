package cricket;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("applicationContext.xml");
        // Match m1=c1.getBean("i1",Match.class);
        Player p1=c1.getBean("i1", Player.class);
        p1.playerInfo();
        p1.playingMatch();

        System.out.println("==============================");


        Player p2=c1.getBean("n1", Player.class);
        p2.playerInfo();
        p2.playingMatch();

    }
}
