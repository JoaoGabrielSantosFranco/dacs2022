package br.univille.apidacs2022.service.impl;

import br.univille.coredacs2022.repository.PlanoDeSaudeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.apidacs2022.service.PlanoDeSaudeService;
import br.univille.coredacs2022.entity.PlanoDeSaude;

@Service
public class PlanoDeSaudeServiceImpl implements PlanoDeSaudeService {

    @Autowired
    private PlanoDeSaudeRepository repository;

    @Override
    public List<PlanoDeSaude> getAll() {
        return repository.findAll();
    }

    @Override
    public PlanoDeSaude getById(long id) {
        return null;
    }
}
