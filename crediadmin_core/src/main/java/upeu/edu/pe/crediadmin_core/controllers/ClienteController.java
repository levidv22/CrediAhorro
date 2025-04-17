package upeu.edu.pe.crediadmin_core.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu.edu.pe.crediadmin_core.entities.Cliente;
import upeu.edu.pe.crediadmin_core.services.ClienteService;

import java.net.URI;

@RestController
@RequestMapping("cliente")
@Tag(name = "Clientes Resource")
public class ClienteController {

    private final ClienteService clienteService;
    private final Logger log = LoggerFactory.getLogger(ClienteController.class);

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(summary = "Obtener cliente por nombre")
    @GetMapping("{nombres}")
    public ResponseEntity<Cliente> get(@PathVariable String nombres) {
        return ResponseEntity.ok(clienteService.readByNombres(nombres));
    }

    @Operation(summary = "Registrar nuevo cliente")
    @PostMapping
    public ResponseEntity<Cliente> post(@RequestBody Cliente cliente) {
        return ResponseEntity.created(
                        URI.create(clienteService.create(cliente).getNombres()))
                .build();
    }

    @Operation(summary = "Actualizar datos del cliente")
    @PutMapping("{nombres}")
    public ResponseEntity<Cliente> put(@RequestBody Cliente cliente, @PathVariable String nombres) {
        return ResponseEntity.ok(clienteService.update(cliente, nombres));
    }

    @Operation(summary = "Eliminar cliente por nombre")
    @DeleteMapping("{nombres}")
    public ResponseEntity<?> delete(@PathVariable String nombres) {
        clienteService.delete(nombres);
        return ResponseEntity.noContent().build();
    }
}
