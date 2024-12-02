package tablas;

import Negocio.NegocioCarrera;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CarreraTabla {
   public void cargarCarreras(javax.swing.JTable tbCarrera) {
        try {
            NegocioCarrera negocioCarrera = new NegocioCarrera();
            List<Object[]> carrera = negocioCarrera.mostrarCarrera();

            DefaultTableModel model = (DefaultTableModel) tbCarrera.getModel();
            model.setRowCount(0); 

            for (Object[] carrerita : carrera) {
                model.addRow(carrerita);
            }
        } catch (Exception e) {
            System.out.println("error en este codigo");
        }
   }
}