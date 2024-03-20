package iocannotations;

import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements Mobile{
    @Override
    public void getType() {
        System.out.println("THIS IS TYPE OF SMART PHONE");
    }

    @Override
    public void getSpecifications() {

        System.out.println("THIS PRICE OF SMART PHONE IS 30000/-");
    }
}
