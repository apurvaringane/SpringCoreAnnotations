package cricket;

import org.springframework.stereotype.Component;

@Component("match2")
public class T20 implements Match{
    @Override
    public void matchInfo() {
        System.out.println("THIS IS T20 MATCH");
    }
}
