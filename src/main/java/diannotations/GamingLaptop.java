package diannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("l1")
public class GamingLaptop implements Laptop{


    private Processor processor;
    @Autowired
    public GamingLaptop(@Qualifier("nvidia") Processor processor) {
        this.processor = processor;
    }

    @Override
    public void getType() {
        System.out.println("THIS IS GAMING LAPTOP");
    }

    @Override
    public void getProcessor() {
      processor.getType();
    }
}
