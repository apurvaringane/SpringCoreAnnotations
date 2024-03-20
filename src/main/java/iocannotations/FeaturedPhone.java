package iocannotations;

import org.springframework.stereotype.Component;

@Component("m1")
public class FeaturedPhone implements Mobile{
    @Override
    public void getType() {
        System.out.println("THIS IS TYPE OF FEATURED PHONE");
    }

    @Override
    public void getSpecifications() {
        System.out.println("THE PRICE OF FEATURED PHONE IS Rs-25000");
    }
}
