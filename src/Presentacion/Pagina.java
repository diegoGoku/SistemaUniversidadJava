
package Presentacion;

import Negocio.NegocioAlumno;
import Negocio.NegocioCarrera;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.AlumnoTabla;
import tablas.CarreraTabla;
import tablas.ProfesorTabla;


public class Pagina extends javax.swing.JFrame {
    CarreraTabla carreraTabla ;
    ProfesorTabla profesorTabla;
    AlumnoTabla alumnoTabla;
    public Pagina() {
        
        initComponents();
        

            alumnoTabla = new AlumnoTabla();
    
            carreraTabla = new CarreraTabla();
            profesorTabla = new ProfesorTabla();
    
            carreraTabla.cargarCarreras(TBCarrera);
            profesorTabla.cargarProfesores(TBProfesor);
            alumnoTabla.cargarAlumnos(TBAlumnos);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNCrearCarrera1 = new javax.swing.JButton();
        BTNActualizarCarrera1 = new javax.swing.JButton();
        BTNEliminarCarrera1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAlumno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnProfesor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMaterias = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnEspecialidades = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnHorarios = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBAlumnos = new javax.swing.JTable();
        BTNCrearAlumno = new javax.swing.JButton();
        BTNRefrescarAlumnos = new javax.swing.JButton();
        BTNEliminarAlumno = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BTNCrearProfesor = new javax.swing.JButton();
        BTNActualizarProfesor = new javax.swing.JButton();
        BTNEliminarProfesor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBProfesor = new javax.swing.JTable();
        BTNActualizar = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        panel5 = new javax.swing.JPanel();
        panel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBCarrera = new javax.swing.JTable();
        BTNCrearCarrera = new javax.swing.JButton();
        BTNActualizarCarrera = new javax.swing.JButton();
        BTNEliminarCarrera2 = new javax.swing.JButton();

        BTNCrearCarrera1.setBackground(new java.awt.Color(204, 0, 204));
        BTNCrearCarrera1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNCrearCarrera1.setForeground(new java.awt.Color(255, 255, 255));
        BTNCrearCarrera1.setText("Crear");

        BTNActualizarCarrera1.setBackground(new java.awt.Color(0, 153, 0));
        BTNActualizarCarrera1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNActualizarCarrera1.setForeground(new java.awt.Color(255, 255, 255));
        BTNActualizarCarrera1.setText("Actualizar");

        BTNEliminarCarrera1.setBackground(new java.awt.Color(255, 0, 51));
        BTNEliminarCarrera1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNEliminarCarrera1.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminarCarrera1.setText("Eliminar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnInicio.setBackground(new java.awt.Color(204, 0, 204));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnAlumno.setBackground(new java.awt.Color(204, 0, 204));
        btnAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlumnoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alumnos");

        javax.swing.GroupLayout btnAlumnoLayout = new javax.swing.GroupLayout(btnAlumno);
        btnAlumno.setLayout(btnAlumnoLayout);
        btnAlumnoLayout.setHorizontalGroup(
            btnAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAlumnoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAlumnoLayout.setVerticalGroup(
            btnAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAlumnoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnProfesor.setBackground(new java.awt.Color(204, 0, 204));
        btnProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfesorMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profesores");

        javax.swing.GroupLayout btnProfesorLayout = new javax.swing.GroupLayout(btnProfesor);
        btnProfesor.setLayout(btnProfesorLayout);
        btnProfesorLayout.setHorizontalGroup(
            btnProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfesorLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProfesorLayout.setVerticalGroup(
            btnProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfesorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnMaterias.setBackground(new java.awt.Color(204, 0, 204));
        btnMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMateriasMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Materias");

        javax.swing.GroupLayout btnMateriasLayout = new javax.swing.GroupLayout(btnMaterias);
        btnMaterias.setLayout(btnMateriasLayout);
        btnMateriasLayout.setHorizontalGroup(
            btnMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMateriasLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMateriasLayout.setVerticalGroup(
            btnMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMateriasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnEspecialidades.setBackground(new java.awt.Color(204, 0, 204));
        btnEspecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEspecialidadesMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Especialidades");

        javax.swing.GroupLayout btnEspecialidadesLayout = new javax.swing.GroupLayout(btnEspecialidades);
        btnEspecialidades.setLayout(btnEspecialidadesLayout);
        btnEspecialidadesLayout.setHorizontalGroup(
            btnEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEspecialidadesLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEspecialidadesLayout.setVerticalGroup(
            btnEspecialidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEspecialidadesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnHorarios.setBackground(new java.awt.Color(204, 0, 204));
        btnHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHorariosMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Carreras");

        javax.swing.GroupLayout btnHorariosLayout = new javax.swing.GroupLayout(btnHorarios);
        btnHorarios.setLayout(btnHorariosLayout);
        btnHorariosLayout.setHorizontalGroup(
            btnHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHorariosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnHorariosLayout.setVerticalGroup(
            btnHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(btnHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHorariosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText("Universidad Bethesda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEspecialidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel8.setText("Alumnos");

        TBAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "apellido", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(TBAlumnos);

        BTNCrearAlumno.setBackground(new java.awt.Color(204, 0, 204));
        BTNCrearAlumno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNCrearAlumno.setForeground(new java.awt.Color(255, 255, 255));
        BTNCrearAlumno.setText("Crear");
        BTNCrearAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCrearAlumnoActionPerformed(evt);
            }
        });

        BTNRefrescarAlumnos.setBackground(new java.awt.Color(0, 204, 204));
        BTNRefrescarAlumnos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNRefrescarAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        BTNRefrescarAlumnos.setText("Refrescar");
        BTNRefrescarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRefrescarAlumnosActionPerformed(evt);
            }
        });

        BTNEliminarAlumno.setBackground(new java.awt.Color(255, 0, 51));
        BTNEliminarAlumno.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNEliminarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminarAlumno.setText("Eliminar");
        BTNEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarAlumnoActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8))
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(BTNEliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(BTNRefrescarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(BTNCrearAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNCrearAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNEliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNRefrescarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148)))
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel10.setText("Profesor");

        BTNCrearProfesor.setBackground(new java.awt.Color(204, 0, 204));
        BTNCrearProfesor.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNCrearProfesor.setForeground(new java.awt.Color(255, 255, 255));
        BTNCrearProfesor.setText("Crear");
        BTNCrearProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCrearProfesorActionPerformed(evt);
            }
        });

        BTNActualizarProfesor.setBackground(new java.awt.Color(0, 153, 0));
        BTNActualizarProfesor.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNActualizarProfesor.setForeground(new java.awt.Color(255, 255, 255));
        BTNActualizarProfesor.setText("Actualizar");
        BTNActualizarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActualizarProfesorActionPerformed(evt);
            }
        });

        BTNEliminarProfesor.setBackground(new java.awt.Color(255, 0, 51));
        BTNEliminarProfesor.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNEliminarProfesor.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminarProfesor.setText("Eliminar");
        BTNEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarProfesorActionPerformed(evt);
            }
        });

        TBProfesor.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        TBProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nombre", "apellido", "especialidad"
            }
        ));
        jScrollPane4.setViewportView(TBProfesor);

        BTNActualizar.setBackground(new java.awt.Color(0, 102, 204));
        BTNActualizar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BTNActualizar.setText("Refrescar");
        BTNActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(panel3Layout.createSequentialGroup()
                    .addGap(243, 243, 243)
                    .addComponent(BTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(BTNEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNActualizarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(BTNCrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addContainerGap(778, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNActualizarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCrearProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );

        panel4.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        panel5.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        panel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel9.setText("Carreras");

        TBCarrera.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        TBCarrera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nombre", "descipcion"
            }
        ));
        TBCarrera.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(TBCarrera);

        BTNCrearCarrera.setBackground(new java.awt.Color(204, 0, 204));
        BTNCrearCarrera.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNCrearCarrera.setForeground(new java.awt.Color(255, 255, 255));
        BTNCrearCarrera.setText("Crear");
        BTNCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCrearCarreraActionPerformed(evt);
            }
        });

        BTNActualizarCarrera.setBackground(new java.awt.Color(0, 153, 0));
        BTNActualizarCarrera.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNActualizarCarrera.setForeground(new java.awt.Color(255, 255, 255));
        BTNActualizarCarrera.setText("Actualizar");
        BTNActualizarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNActualizarCarreraActionPerformed(evt);
            }
        });

        BTNEliminarCarrera2.setBackground(new java.awt.Color(255, 0, 51));
        BTNEliminarCarrera2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BTNEliminarCarrera2.setForeground(new java.awt.Color(255, 255, 255));
        BTNEliminarCarrera2.setText("Eliminar");
        BTNEliminarCarrera2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarCarrera2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNEliminarCarrera2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNActualizarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNCrearCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNEliminarCarrera2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNActualizarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCrearCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);

    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlumnoMouseClicked
       
        panel1.setVisible(false);
        panel2.setVisible(true);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }//GEN-LAST:event_btnAlumnoMouseClicked

    private void btnProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesorMouseClicked
       
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(true);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }//GEN-LAST:event_btnProfesorMouseClicked

    private void btnMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMateriasMouseClicked
    
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
        panel5.setVisible(false);
        panel6.setVisible(false);
    }//GEN-LAST:event_btnMateriasMouseClicked

    private void btnEspecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEspecialidadesMouseClicked
       
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
        panel6.setVisible(false);
    }//GEN-LAST:event_btnEspecialidadesMouseClicked

    private void btnHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHorariosMouseClicked
     
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(true);
    }//GEN-LAST:event_btnHorariosMouseClicked

    private void BTNCrearProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearProfesorActionPerformed
         ProfesorForm profesorForm = new ProfesorForm();
        profesorForm.setVisible(true);
    }//GEN-LAST:event_BTNCrearProfesorActionPerformed

    private void BTNActualizarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActualizarProfesorActionPerformed
     int selectedRow = TBProfesor.getSelectedRow(); 
    if (selectedRow == -1) { 
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Por favor, seleccione un profesor para editar.", 
            "Advertencia", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    String idProfesor = TBProfesor.getValueAt(selectedRow, 0).toString();
    String nombre = TBProfesor.getValueAt(selectedRow, 1).toString();   
    String apellido = TBProfesor.getValueAt(selectedRow, 2).toString(); 
    String especialidad = TBProfesor.getValueAt(selectedRow, 3).toString(); 

    ProfesorForm profesorForm = new ProfesorForm(idProfesor, nombre, apellido, especialidad,TBProfesor);
    profesorForm.setVisible(true);
    }//GEN-LAST:event_BTNActualizarProfesorActionPerformed

    private void BTNEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarProfesorActionPerformed
       int selectedRow = TBProfesor.getSelectedRow(); 
    if (selectedRow == -1) { 
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Por favor, seleccione un profesor para eliminar.", 
            "Advertencia", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    String idProfesor = TBProfesor.getValueAt(selectedRow, 0).toString();
    try {
        Negocio.NegocioProfesor negocioProfesor = new Negocio.NegocioProfesor();
        negocioProfesor.NEliminarProfesor(idProfesor);
        javax.swing.JOptionPane.showMessageDialog(this, "Profesor eliminado exitosamente.");
      profesorTabla.cargarProfesores(TBProfesor);
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar el profesor: " + e.getMessage());
    }
    }//GEN-LAST:event_BTNEliminarProfesorActionPerformed

    private void BTNActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActualizarActionPerformed
        profesorTabla.cargarProfesores(TBProfesor);
    }//GEN-LAST:event_BTNActualizarActionPerformed

    private void BTNEliminarCarrera2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarCarrera2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNEliminarCarrera2ActionPerformed

    private void BTNActualizarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActualizarCarreraActionPerformed
        int selectedRow = TBCarrera .getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Por favor, seleccione una carrera para editar.",
                "Advertencia",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String idCarrera = TBCarrera.getValueAt(selectedRow, 0).toString();
        String nombre = TBCarrera.getValueAt(selectedRow, 1).toString();
        String descripcion = TBCarrera.getValueAt(selectedRow, 2).toString();

        CarreraForm carreraForm = new CarreraForm(idCarrera, nombre, descripcion, TBCarrera);
        carreraForm.setVisible(true);
    }//GEN-LAST:event_BTNActualizarCarreraActionPerformed

    private void BTNCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearCarreraActionPerformed
        CarreraForm carreraForm = new CarreraForm();
        carreraForm.setVisible(true);
    }//GEN-LAST:event_BTNCrearCarreraActionPerformed

    private void BTNEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarAlumnoActionPerformed
     int selectedRow = TBAlumnos.getSelectedRow(); 
    if (selectedRow == -1) { 
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Por favor, seleccione un alumno para eliminar.", 
            "Advertencia", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    String idAlumno = TBAlumnos.getValueAt(selectedRow, 0).toString();
    
    int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
        this, 
        "¿Está seguro que desea eliminar este alumno?", 
        "Confirmar Eliminación", 
        javax.swing.JOptionPane.YES_NO_OPTION
    );
    
    if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
        try {
            Negocio.NegocioAlumno negocioAlumno = new Negocio.NegocioAlumno();
            
            negocioAlumno.NEliminarAlumno(Integer.parseInt(idAlumno));
         
            javax.swing.JOptionPane.showMessageDialog(this, "Alumno eliminado exitosamente.");

            alumnoTabla.cargarAlumnos(TBAlumnos);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Error al eliminar el alumno: " + e.getMessage(), 
                "Error", 
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
    }
    }//GEN-LAST:event_BTNEliminarAlumnoActionPerformed

    private void BTNRefrescarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRefrescarAlumnosActionPerformed
           alumnoTabla.cargarAlumnos(TBAlumnos);

    }//GEN-LAST:event_BTNRefrescarAlumnosActionPerformed

    private void BTNCrearAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearAlumnoActionPerformed
        try {
            AlumnoForm alumnoForm = new AlumnoForm(TBAlumnos );
            alumnoForm.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Pagina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNCrearAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNActualizar;
    private javax.swing.JButton BTNActualizarCarrera;
    private javax.swing.JButton BTNActualizarCarrera1;
    private javax.swing.JButton BTNActualizarProfesor;
    private javax.swing.JButton BTNCrearAlumno;
    private javax.swing.JButton BTNCrearCarrera;
    private javax.swing.JButton BTNCrearCarrera1;
    private javax.swing.JButton BTNCrearProfesor;
    private javax.swing.JButton BTNEliminarAlumno;
    private javax.swing.JButton BTNEliminarCarrera1;
    private javax.swing.JButton BTNEliminarCarrera2;
    private javax.swing.JButton BTNEliminarProfesor;
    private javax.swing.JButton BTNRefrescarAlumnos;
    public javax.swing.JTable TBAlumnos;
    public javax.swing.JTable TBCarrera;
    public javax.swing.JTable TBProfesor;
    private javax.swing.JPanel btnAlumno;
    private javax.swing.JPanel btnEspecialidades;
    private javax.swing.JPanel btnHorarios;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnMaterias;
    private javax.swing.JPanel btnProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    // End of variables declaration//GEN-END:variables
}
