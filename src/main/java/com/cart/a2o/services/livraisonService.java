package com.cart.a2o.services;

import com.cart.a2o.entities.livraison;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface livraisonService {
    @Transactional
    livraison createLivraison(livraison livraison);

    @Transactional
    livraison updateLivraison(Long livraisonId, livraison livraison);

    @Transactional
    void deleteLivraison(Long livraisonId);

    livraison getLivraisonById(Long livraisonId);

    List<livraison> getAllLivraisons();
}
