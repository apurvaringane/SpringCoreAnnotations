package diannotations;

import org.springframework.stereotype.Component;

@Component
public class Intel implements Processor{
    @Override
    public void getType() {
        System.out.println("THIS IS I5 PROCESSOR");
    }
}
