package upeu.edu.pe.crediadmin_core.services;

import upeu.edu.pe.crediadmin_core.entities.Cliente;

public interface ClienteService {
    Cliente create(Cliente cliente);
    Cliente readByNombres(String nombres);
    Cliente update(Cliente cliente, String nombres);
    void delete(String nombres);
}
