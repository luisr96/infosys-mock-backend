package com.example.store.service;

import com.example.store.model.Cart;
import com.example.store.repo.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Optional<Cart> getCart(long id) {
        return cartRepository.findById(id);
    }
}
