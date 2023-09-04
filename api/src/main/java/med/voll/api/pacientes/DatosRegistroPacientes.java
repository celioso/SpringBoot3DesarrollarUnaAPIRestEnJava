package med.voll.api.pacientes;

import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroPacientes(
        String nombre,
        String email,
        int telefono,
        int documentoIdentidad,
        Seguro seguro,
        DatosDireccion direccion
) {
}