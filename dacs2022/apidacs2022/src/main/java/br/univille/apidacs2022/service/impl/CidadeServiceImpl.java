package br.univille.apidacs2022.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.apidacs2022.service.CidadeService;
import br.univille.coredacs2022.entity.Cidade;
import br.univille.coredacs2022.repository.CidadeRepository;

@Service
public class CidadeServiceImpl implements CidadeService{

    @Autowired
    private CidadeRepository repository;

    @Override
    public List<Cidade> getAll() {
        return repository.findAll();
    }

    @Override
    public Cidade findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }


}
