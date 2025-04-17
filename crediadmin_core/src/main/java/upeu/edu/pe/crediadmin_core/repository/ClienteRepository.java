package upeu.edu.pe.crediadmin_core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.crediadmin_core.entities.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByNombres(String nombres);
}
