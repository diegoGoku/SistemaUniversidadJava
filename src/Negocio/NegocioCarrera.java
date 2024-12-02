
package Negocio;

import Dato.DatoCarrera;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class NegocioCarrera {

     DatoCarrera DCarrera;

    public NegocioCarrera() {
     DCarrera = new DatoCarrera();
    }
      public void NInsertarCarrera(String nombre, String descripcion) throws Exception {
    
          System.out.println(nombre+descripcion);
            DCarrera.DInsertarCarrera(nombre,descripcion);

        System.out.println("Negocios  - Insertar carrera a la base de datos: " + nombre + " - " + descripcion);
    }

    public void NModificarCarrera(String idCarrera, String nombre, String descripcion) throws Exception {

        DCarrera.DModificarCarrera(idCarrera,nombre,descripcion);

        System.out.println("Negocio - Modificar carrera: ID=" + idCarrera + ", Nombre=" + nombre + ", Descripción=" + descripcion);
    }

    public void NEliminarCarrera(String idCarrera) throws Exception {
        DCarrera.DEliminarCarrera(idCarrera);

        System.out.println("Negocio - Eliminar carrera: ID=" + idCarrera);
    }

public List<Object[]> mostrarCarrera() throws Exception {
    ResultSet rs = DCarrera.DMostrarCarrera();
    List<Object[]> carreras = new ArrayList<>();
    while (rs.next()) {
        Object[] carrera = new Object[3];
        carrera[0] = rs.getInt("id");
        carrera[1] = rs.getString("nombre");
        carrera[2] = rs.getString("descripcion");
        carreras.add(carrera);
    }
    return carreras;
}
    
}
