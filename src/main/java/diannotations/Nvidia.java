package diannotations;

import org.springframework.stereotype.Component;
@Component
public class Nvidia implements Processor{
    @Override
    public void getType() {
        System.out.println("THIS IS NVIDIA PROCESSOR");
    }
}
