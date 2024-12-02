package Negocio;

import Dato.DatoAlumno;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NegocioAlumno {

    DatoAlumno DAlumno;

    public NegocioAlumno() {

        DAlumno = new DatoAlumno();
    }

    public void NInsertarAlumno(String nom, String Apell, char sexo) throws Exception {
        DAlumno.setNombre(nom);
        DAlumno.setApellido(Apell);
        DAlumno.setSexo(sexo);
        DAlumno.DIsertarAlumno();

        System.out.println("Negocio" + nom + Apell + sexo);
    }

    public void NModificarAlumno(int idPersona, String nom, String Apell, char sexo) throws Exception {
        DAlumno.setId(idPersona);
        DAlumno.setNombre(nom);
        DAlumno.setApellido(Apell);
        DAlumno.setSexo(sexo);
        DAlumno.DModificarAlumno();

    }

    public void NEliminarAlumno(int idPersona) throws Exception {
        DAlumno.setId(idPersona);
        DAlumno.DEliminarAlumno();
    }
    
    public List<Object[]> mostrarAlumno() throws Exception {
        ResultSet rs = DAlumno.DMostrarAlumno();
        List<Object[]> alumnos = new ArrayList<>();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String sexo = rs.getString("sexo");
            
            alumnos.add(new Object[]{id, nombre, apellido, sexo});
        }
        return alumnos;
    }
}
