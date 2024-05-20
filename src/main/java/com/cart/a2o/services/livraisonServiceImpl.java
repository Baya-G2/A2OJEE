package com.cart.a2o.services;

import com.cart.a2o.entities.livraison;
import com.cart.a2o.repositories.livraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class livraisonServiceImpl implements livraisonService {

    @Autowired
    private livraisonRepository livraisonRepository;

    @Transactional
    @Override
    public livraison createLivraison(livraison livraison) {
        return livraisonRepository.save(livraison);
    }

    @Transactional
    @Override
    public livraison updateLivraison(Long livraisonId, livraison livraison) {
        Optional<livraison> existingLivraisonOptional = livraisonRepository.findById(livraisonId);
        if (!existingLivraisonOptional.isPresent()) {
            throw new IllegalArgumentException("Livraison not found");
        }

        livraison existingLivraison = existingLivraisonOptional.get();
        existingLivraison.setAddresse_liv(livraison.getAddresse_liv());
        existingLivraison.setDate_de_liv(livraison.getDate_de_liv());
        existingLivraison.setCommands(livraison.getCommands());
        return livraisonRepository.save(existingLivraison);
    }

    @Transactional
    @Override
    public void deleteLivraison(Long livraisonId) {
        if (!livraisonRepository.existsById(livraisonId)) {
            throw new IllegalArgumentException("Livraison not found");
        }
        livraisonRepository.deleteById(livraisonId);
    }

    @Override
    public livraison getLivraisonById(Long livraisonId) {
        return livraisonRepository.findById(livraisonId)
                .orElseThrow(() -> new IllegalArgumentException("Livraison not found"));
    }

    @Override
    public List<livraison> getAllLivraisons() {
        return livraisonRepository.findAll();
    }
}
