package cricket;

import org.springframework.stereotype.Component;

@Component("match1")
public class OneDay implements Match{
    @Override
    public void matchInfo() {
        System.out.println("THIS IS ONE DAY MATCH");
    }
}
