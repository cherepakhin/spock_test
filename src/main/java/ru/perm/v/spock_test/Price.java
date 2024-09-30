package ru.perm.v.spock_test;

import java.math.BigDecimal;

public class Price {

    public  static BigDecimal price = BigDecimal.valueOf(100);

    public static BigDecimal getPrice(String product){
        return price;
    }
}
