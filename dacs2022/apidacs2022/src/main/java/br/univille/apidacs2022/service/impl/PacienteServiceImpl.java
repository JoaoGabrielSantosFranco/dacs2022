package main.java.br.univille.apidacs2022.service.impl;
import java.util.List;

import br.univille.apidacs2022.service.PacienteService;

@Service
public class PacienteServiceImpl 
    implements PacienteService{
        @AutoWired
        private PacienteRepository repository;

        @Override
        public List<Paciente> getAll(){
            return repository.findAll();
        }

        @Override
        public Pacinete save(Pacinete paciente){
            repository.save(paciente);
            return paciente;
        }

        @Override 
        public Paciente delete(long id){
            return null;
        }

        @Override 
        public List<Paciente> getByName(String nome){
            return repository.findByNomeIgnoreCaseContaining(nome);
        }


    }

