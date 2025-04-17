package upeu.edu.pe.crediadmin_core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.crediadmin_core.entities.Credito;

public interface CreditoRepository extends JpaRepository<Credito, Long> {
}
