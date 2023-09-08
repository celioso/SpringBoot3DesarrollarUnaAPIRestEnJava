package med.voll.api.pacientes;



public record DatosListadoPaciente(String nombre, String seguro, String telefono, String email) {
    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getNombre(),
                paciente.getSeguro(),
                paciente.getTelefono(),
                paciente.getEmail());
    }
}
