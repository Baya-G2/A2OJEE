package com.cart.a2o.services;

import com.cart.a2o.entities.compte;
import com.cart.a2o.repositories.compteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class compteServiceImpl implements compteService {

    @Autowired
    private compteRepository compteRepository;

    @Transactional
    @Override
    public compte createCompte(compte compte) {
        return compteRepository.save(compte);
    }

    @Transactional
    @Override
    public compte updateCompte(Long compteId, compte compte) {
        Optional<compte> existingCompteOptional = compteRepository.findById(compteId);
        if (!existingCompteOptional.isPresent()) {
            throw new IllegalArgumentException("Compte not found");
        }

        compte existingCompte = existingCompteOptional.get();
        existingCompte.setCreatedAt(compte.getCreatedAt());
        existingCompte.setPassword(compte.getPassword());
        existingCompte.setLogin(compte.getLogin());
        return compteRepository.save(existingCompte);
    }

    @Transactional
    @Override
    public void deleteCompte(Long compteId) {
        if (!compteRepository.existsById(compteId)) {
            throw new IllegalArgumentException("Compte not found");
        }
        compteRepository.deleteById(compteId);
    }

    @Override
    public compte getCompteById(Long compteId) {
        return compteRepository.findById(compteId)
                .orElseThrow(() -> new IllegalArgumentException("Compte not found"));
    }

    @Override
    public List<compte> getAllComptes() {
        return compteRepository.findAll();
    }
}
