package ru.perm.v.spock_test;

import java.math.BigDecimal;
import java.util.Objects;

public class ShoppingItem {
    String item = "";
    int quantity = 0;

    public ShoppingItem(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public static BigDecimal getPrice(String item) {
        return Price.getPrice(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingItem)) return false;
        ShoppingItem that = (ShoppingItem) o;
        return quantity == that.quantity && Objects.equals(item, that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, quantity);
    }
}
