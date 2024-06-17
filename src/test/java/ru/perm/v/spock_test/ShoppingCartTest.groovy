package ru.perm.v.spock_test


import spock.lang.Specification

class ShoppingCartTest extends Specification {
    def "verify multiple properties of a ShoppingCart"() {
        given:
            ShoppingCart cart = new ShoppingCart()
            cart.addItem("Apple", 3)
            cart.addItem("Banana", 2)

        expect:
            with(cart) {
                totalItems == 5
                totalPrice == 10.00
                items.size()  ==  2
                items.contains(new ShoppingItem("Apple",3))
                items.contains(new ShoppingItem("Banana",2))
            }
    }

    def "verify simple ShoppingCart"() {
        given:
            ShoppingCart cart = new ShoppingCart()
            cart.addItem("Apple", 3)
            cart.addItem("Banana", 2)

        expect:
            cart.totalPrice   ==  10.00
            cart.totalItems  ==  5
    }
}