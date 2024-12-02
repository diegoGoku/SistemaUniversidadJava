package Negocio;

import Dato.DatoProfesor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NegocioProfesor {

    private DatoProfesor dProfesor;

    public NegocioProfesor() {
        dProfesor = new DatoProfesor();
    }

    public void NInsertarProfesor(String nombre, String apellido, String especialidad) throws Exception {
        dProfesor.DInsertarProfesor(nombre, apellido, especialidad);
        System.out.println("Negocio - Insertar profesor: " + nombre + " " + apellido + " - " + especialidad);
    }

    public void NModificarProfesor(String id, String nombre, String apellido, String especialidad) throws Exception {
        dProfesor.DModificarProfesor(id, nombre, apellido, especialidad);
        System.out.println("Negocio - Modificar profesor: ID=" + id + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Especialidad=" + especialidad);
    }

    public void NEliminarProfesor(String id) throws Exception {
        dProfesor.DEliminarProfesor(id);
        System.out.println("Negocio - Eliminar profesor: ID=" + id);
    }

    public List<Object[]> NMostrarProfesores() throws Exception {
        ResultSet rs = dProfesor.DMostrarProfesores();
        List<Object[]> profesores = new ArrayList<>();
        while (rs.next()) {
            Object[] profesor = new Object[4];
            profesor[0] = rs.getInt("id");
            profesor[1] = rs.getString("nombre");
            profesor[2] = rs.getString("apellido");
            profesor[3] = rs.getString("especialidad");
            profesores.add(profesor);
        }
        return profesores;
    }
}
