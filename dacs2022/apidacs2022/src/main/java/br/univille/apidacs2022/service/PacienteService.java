package br.univille.apidacs2022.service;

import java.util.List;

import br.univille.dacs2022.dto.PacienteDTO;

public interface PacienteService {
    public List<Paciente> getAll();

    public Paciente save(Paciente paciente);

    public Paciente findById(long id);

    public Paciente delete(long id);

    public List<paciente> getByName(String nome);

}
