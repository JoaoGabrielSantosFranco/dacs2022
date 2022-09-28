package br.univille.apidacs2022.service;

import java.util.List;

import br.univille.coredacs2022.entity.PlanoDeSaude;

public interface PlanoDeSaudeService {
    public List<PlanoDeSaude> getAll();

    public PlanoDeSaude getById(long id);
}
