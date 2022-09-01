package com.example.store.controller;

import com.example.store.model.Cart;
import com.example.store.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/orders/{id}")
    public Optional<Cart> getCart(@PathVariable long id) {
        return cartService.getCart(id);
    }

    @PostMapping("/orders")
    public Cart addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }
}
