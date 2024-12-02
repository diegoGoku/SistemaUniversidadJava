package Dato;

import java.sql.ResultSet;

public class DatoCarrera {
    String nombre ;
    String descripcion;
    DConexion conn;
    public DatoCarrera() {
        conn= new DConexion();
    }
    public void DInsertarCarrera(String nombre , String descripcion) throws Exception {
        String sql = "INSERT INTO carrera (nombre,descripcion)  VALUES ('" + nombre + "', '" + descripcion + "')";
        System.out.println("Insertando: " + sql);
        conn.insertDate(sql);
    }

    public void DModificarCarrera(String id,String nombre , String descripcion) throws Exception {
        String sql = "UPDATE carrera  SET nombre = '" + nombre + "', descripcion = '" + descripcion + "' WHERE id = " + id;
        System.out.println("Modificando: " + sql);
        conn.updateDate(sql);
    }

    public void DEliminarCarrera(String id) throws Exception {
        String sql = "DELETE FROM carrera WHERE id = " + id;
        System.out.println("Eliminando: " + sql);
        conn.updateDate(sql);
    }

    public ResultSet DMostrarCarrera() throws Exception {
        String sql = "SELECT * FROM carrera";
        System.out.println("Mostrando carreras: " + sql);
        return conn.showDate(sql);
    }
    
}
