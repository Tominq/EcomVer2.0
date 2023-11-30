package ecom.spring.library.service;

import ecom.spring.library.model.Order;
import ecom.spring.library.model.ShoppingCart;

import java.util.List;

public interface OrderService {
    Order save(ShoppingCart shoppingCart);

    List<Order> findAll(String username);

    List<Order> findALlOrders();

    Order acceptOrder(Long id);

    void cancelOrder(Long id);
}
