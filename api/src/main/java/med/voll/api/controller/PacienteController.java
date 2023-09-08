package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DatosListadoMedico;
import med.voll.api.pacientes.DatosListadoPaciente;
import med.voll.api.pacientes.DatosRegistroPaciente;
import med.voll.api.pacientes.Paciente;
import med.voll.api.pacientes.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

        @Autowired
        private PacienteRepository pacienteRepository;
        @PostMapping
        @Transactional
        public void registrarPaciente(@RequestBody @Valid DatosRegistroPaciente datos) {
            pacienteRepository.save(new Paciente(datos));

        }

        //muestra los pacientes
        @GetMapping
        public List<DatosListadoPaciente> listadoMedicos(){
                return pacienteRepository.findAll().stream().map(DatosListadoPaciente::new).toList();
        }
}





