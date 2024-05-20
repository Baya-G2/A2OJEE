package com.cart.a2o.services;

import com.cart.a2o.entities.compte;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface compteService {

    @Transactional
    compte createCompte(compte compte);

    @Transactional
    compte updateCompte(Long compteId, compte compte);

    @Transactional
    void deleteCompte(Long compteId);

    compte getCompteById(Long compteId);

    List<compte> getAllComptes();
}
