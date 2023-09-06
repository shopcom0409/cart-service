package com.shopcom.cart.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "cart_details")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    private String cartId;
    private Double amount;

}
