package upeu.edu.pe.crediadmin_core.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "CrediAdmin API", version = "1.0", description = "CRUD para clientes y créditos"))
public class OpenApiConfig {
}
