package med.voll.api.controller;

import med.voll.api.medico.DatosRegistroMedico;
import med.voll.api.pacientes.DatosRegistroPacientes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
        @PostMapping
        public void registrarPaciente(@RequestBody DatosRegistroPacientes datosRegistroPacientes) {
            System.out.println("Paciente");
            System.out.println(datosRegistroPacientes);
        }
    }




