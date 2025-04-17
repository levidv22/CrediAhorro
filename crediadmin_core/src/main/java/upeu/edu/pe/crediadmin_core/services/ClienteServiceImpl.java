package upeu.edu.pe.crediadmin_core.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import upeu.edu.pe.crediadmin_core.entities.Cliente;
import upeu.edu.pe.crediadmin_core.repository.ClienteRepository;

import java.util.NoSuchElementException;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente readByNombres(String nombres) {
        return clienteRepository.findByNombres(nombres)
                .orElseThrow(() -> new NoSuchElementException("cliente no encontrado"));
    }

    @Override
    public Cliente update(Cliente cliente, String nombres) {
        Cliente clienteToUpdate = clienteRepository.findByNombres(nombres)
                .orElseThrow(() -> new NoSuchElementException("cliente no encontrado"));
        clienteToUpdate.setApellidos(cliente.getApellidos());
        clienteToUpdate.setDireccion(cliente.getDireccion());
        clienteToUpdate.setTelefono(cliente.getTelefono());
        clienteToUpdate.setFecha_registro(cliente.getFecha_registro());
        return clienteRepository.save(clienteToUpdate);
    }

    @Override
    public void delete(String nombres) {
        Cliente clienteToDelete = clienteRepository.findByNombres(nombres)
                .orElseThrow(() -> new NoSuchElementException("cliente no encontrado"));
        clienteRepository.delete(clienteToDelete);
    }
}
