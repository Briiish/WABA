package pe.edu.upc.waba;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(
        name = "javainuseapi",
        scheme = "Bearer",
        bearerFormat = "JWT",               //uso de jwt
        type = SecuritySchemeType.HTTP,     //tipo HTTP para Bearer Token
        in = SecuritySchemeIn.HEADER        //El token se enviara en el encabezado
)
public class    WabaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WabaApplication.class, args);
    }

}
