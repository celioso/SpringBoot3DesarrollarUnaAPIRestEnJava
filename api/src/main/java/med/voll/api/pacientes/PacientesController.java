package med.voll.api.pacientes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PacientesController {

    @PostMapping
    public void registro(@RequestBody DatosRegistroPacientes datos){
        System.out.println("Datos Registrados: " + datos);
    }
}
