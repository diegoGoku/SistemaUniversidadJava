package tablas;

import Negocio.NegocioAlumno;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlumnoTabla {
    public void cargarAlumnos(javax.swing.JTable tbAlumno) {
        try {
            NegocioAlumno negocioAlumno = new NegocioAlumno();
            List<Object[]> alumnos = negocioAlumno.mostrarAlumno();
            
      
            if (alumnos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay alumnos registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            DefaultTableModel model = (DefaultTableModel) tbAlumno.getModel();
            model.setRowCount(0);  
            
            for (Object[] alumno : alumnos) {
                model.addRow(alumno);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, 
                "Error al cargar los alumnos: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            
            e.printStackTrace();
        }
    }
}