package com.shopcom.cart.controller;

import com.shopcom.cart.entity.Cart;
import com.shopcom.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/save-to-cart")
    public ResponseEntity<String> saveCart(@RequestBody Cart cart) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cartService.saveCart(cart));
    }
}
