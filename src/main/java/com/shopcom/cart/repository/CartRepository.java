package com.shopcom.cart.repository;

import com.shopcom.cart.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, String> {

}
