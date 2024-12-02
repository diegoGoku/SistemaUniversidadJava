package tablas;

import Negocio.NegocioProfesor;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProfesorTabla {
   public void cargarProfesores(javax.swing.JTable tbProfesor) {
        try {
            NegocioProfesor negocioProfesor = new NegocioProfesor();
            List<Object[]> profesores = negocioProfesor.NMostrarProfesores(); 
            DefaultTableModel model = (DefaultTableModel) tbProfesor.getModel();
            model.setRowCount(0); 

            for (Object[] profesor : profesores) {
                model.addRow(profesor);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los profesores: " + e.getMessage());
        }
   }
}
