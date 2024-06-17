package ru.perm.v.spock_test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<ShoppingItem> items = new ArrayList<>();
    private Integer totalItems = 0;
    private BigDecimal totalPrice = BigDecimal.ZERO;

    public void addItem(String item, int quantity) {
        items.add(new ShoppingItem(item, quantity));
        totalItems += quantity;
        totalPrice = totalPrice.add(new BigDecimal(quantity * ShoppingItem.getPrice(item)));
    }

    public Integer getTotalItems() {
        return totalItems;
    }
}
