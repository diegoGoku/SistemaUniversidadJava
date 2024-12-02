package Dato;

import java.sql.ResultSet;

public class DatoProfesor {

    private DConexion conn;

    public DatoProfesor() {
        conn = new DConexion();
    }

    public void DInsertarProfesor(String nombre, String apellido, String especialidad) throws Exception {
        String sql = "INSERT INTO profesor (nombre, apellido, especialidad) VALUES ('" 
                     + nombre + "', '" + apellido + "', '" + especialidad + "')";
        conn.insertDate(sql);
        System.out.println("Insertando profesor: " + sql);
    }

    public void DModificarProfesor(String id, String nombre, String apellido, String especialidad) throws Exception {
        String sql = "UPDATE profesor SET nombre = '" + nombre + "', apellido = '" + apellido 
                     + "', especialidad = '" + especialidad + "' WHERE id = " + id;
        conn.updateDate(sql);
        System.out.println("Modificando profesor: " + sql);
    }

    public void DEliminarProfesor(String id) throws Exception {
        String sql = "DELETE FROM profesor WHERE id = " + id;
        conn.deleteDate(sql);
        System.out.println("Eliminando profesor: " + sql);
    }

    public ResultSet DMostrarProfesores() throws Exception {
        String sql = "SELECT * FROM profesor";
        System.out.println("Mostrando profesores: " + sql);
        return conn.showDate(sql);
    }
}
