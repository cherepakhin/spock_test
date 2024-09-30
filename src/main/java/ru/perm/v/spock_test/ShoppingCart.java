package ru.perm.v.spock_test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<ShoppingItem> items = new ArrayList<>();
    private Integer totalItems = 0;
    private BigDecimal totalPrice = BigDecimal.ZERO;

    public void addItem(String item, int quantity) {
        ShoppingItem shoppingItem = new ShoppingItem(item, quantity);
        items.add(shoppingItem);
        totalItems += quantity;
        BigDecimal price = Price.getPrice(item);
        totalPrice = totalPrice.add(price.multiply(new BigDecimal(quantity)));
    }

    public Integer getTotalItems() {
        return totalItems;
    }
}
