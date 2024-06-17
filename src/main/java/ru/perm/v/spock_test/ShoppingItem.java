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

    public static int getPrice(String item) {
        return BigDecimal.ONE.intValue() * 2;
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
