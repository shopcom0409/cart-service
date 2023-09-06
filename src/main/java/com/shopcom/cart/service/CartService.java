package com.shopcom.cart.service;

import com.shopcom.cart.entity.Cart;
import com.shopcom.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public String saveCart(Cart cart) {
        Cart cartDetails = Cart.builder().amount(cart.getAmount()).build();
        cartRepository.save(cartDetails);
        return "Saved to cart";
    }

}
