package Vista;

import java.sql.*;
import Controlador.Conexion;
import Controlador.RazaCombo;
import Modelo.Dueno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {
RazaCombo rc = new RazaCombo();
    public VerDatos() {
        initComponents();
        
        setTitle("Ver Datos Dueño");
        cargarDatosMascotasEnTabla();
        cargarDatosDuenosEnTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMascotas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreEditarMascota = new javax.swing.JTextField();
        txtColorMascota = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservacionesEditarMascota = new javax.swing.JTextArea();
        btnEditarMascota = new javax.swing.JButton();
        btnModificarMascota = new javax.swing.JButton();
        cmbRaza = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDuenos = new javax.swing.JTable();
        btnVolverInicio = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEditarDueno = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtCelularEditarDueno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mascotas");

        jTableMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Raza", "Color", "Alergico", "Atencion Especial", "Observaciones", "Dueño"
            }
        ));
        jScrollPane2.setViewportView(jTableMascotas);

        jLabel5.setText("Nombre:");

        jLabel6.setText("Raza:");

        jLabel7.setText("Color:");

        jLabel9.setText("Observaciones:");

        txtObservacionesEditarMascota.setColumns(20);
        txtObservacionesEditarMascota.setRows(5);
        jScrollPane3.setViewportView(txtObservacionesEditarMascota);

        btnEditarMascota.setText("Editar");
        btnEditarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMascotaActionPerformed(evt);
            }
        });

        btnModificarMascota.setText("Modificar");
        btnModificarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColorMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombreEditarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarMascota)
                            .addComponent(btnModificarMascota))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreEditarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarMascota))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(cmbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtColorMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarMascota))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Dueños");

        jTableDuenos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Celular", "Cantidad de Mascotas"
            }
        ));
        jScrollPane1.setViewportView(jTableDuenos);

        btnVolverInicio.setText("Volver a Inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Celular:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreEditarDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnEditar)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCelularEditarDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnModificar)
                                    .addComponent(btnVolverInicio))
                                .addGap(25, 25, 25))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreEditarDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCelularEditarDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addGap(12, 12, 12)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolverInicio)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        this.dispose();
        Principal pantallaPrincipal = new Principal();
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverInicioActionPerformed
    private boolean edicionPendiente = false;
    private boolean edicionPendienteMascota = false;
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = jTableDuenos.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Establecer edicionPendiente en true y seleccionar la fila en la tabla
            edicionPendiente = true;
            jTableDuenos.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);

            // Obtener los valores de las columnas "Nombre" y "Celular" en la fila seleccionada
            String nombre = jTableDuenos.getValueAt(filaSeleccionada, 0).toString(); // Índice 0 para la columna "Nombre"
            String celular = jTableDuenos.getValueAt(filaSeleccionada, 1).toString(); // Índice 1 para la columna "Celular"

            // Asignar los valores a los campos de texto
            txtNombreEditarDueno.setText(nombre);
            txtCelularEditarDueno.setText(celular);
        } else {
            // Manejar el caso en el que no se haya seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Selecciona una fila antes de editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (edicionPendiente) {
            DefaultTableModel model = (DefaultTableModel) jTableDuenos.getModel();
            int selectedRow = jTableDuenos.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla Dueños para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                // Obtén los valores editados desde tus campos de edición
                String nuevoNombre = txtNombreEditarDueno.getText();
                String nuevoCelular = txtCelularEditarDueno.getText();

                // Obtén los valores originales de la fila seleccionada
                String nombreOriginal = jTableDuenos.getValueAt(selectedRow, 0).toString();
                String celularOriginal = jTableDuenos.getValueAt(selectedRow, 1).toString();

                // Verifica si ha habido cambios
                if (!nuevoNombre.equals(nombreOriginal) || !nuevoCelular.equals(celularOriginal)) {
                    // Ha habido cambios, actualiza la fila en la tabla
                    jTableDuenos.setValueAt(nuevoNombre, selectedRow, 0); // Ajusta el índice según corresponda al nombre
                    jTableDuenos.setValueAt(nuevoCelular, selectedRow, 1); // Ajusta el índice según corresponda al celular

                    // Aquí puedes agregar código para guardar los cambios en tu base de datos
                    boolean modificacionExitosa = modificarRegistroEnBaseDeDatos(nombreOriginal, celularOriginal, nuevoNombre, nuevoCelular);

                    if (modificacionExitosa) {
                        JOptionPane.showMessageDialog(null, "Registro modificado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar el registro en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    // Limpia los campos de texto después de la modificación
                    txtNombreEditarDueno.setText("");
                    txtCelularEditarDueno.setText("");
                } else {
                    // No ha habido cambios, muestra un mensaje informativo
                    JOptionPane.showMessageDialog(null, "No se han realizado cambios en el registro", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            // Restablece edicionPendiente a false después de la modificación
            edicionPendiente = false;
        } else {
            // Muestra un mensaje de advertencia si no se ha realizado una edición pendiente
            JOptionPane.showMessageDialog(null, "No se ha realizado ninguna edición pendiente", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEditarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMascotaActionPerformed
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = jTableMascotas.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Establecer edicionPendienteMascota en true y seleccionar la fila en la tabla
            
            edicionPendienteMascota = true;
            jTableMascotas.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);

            // Obtener los valores de las columnas necesarias en la fila seleccionada
            String nombreMascota = jTableMascotas.getValueAt(filaSeleccionada, 0).toString(); // Índice 0 para la columna "Nombre"
            String raza = jTableMascotas.getValueAt(filaSeleccionada, 1).toString(); // Índice 1 para la columna "Raza"
            String color = jTableMascotas.getValueAt(filaSeleccionada, 2).toString(); // Índice 2 para la columna "Color"
            String observaciones = jTableMascotas.getValueAt(filaSeleccionada, 5).toString(); // Índice 3 para la columna "Observaciones"

            // Asignar los valores a los campos de texto correspondientes
            
            txtNombreEditarMascota.setText(nombreMascota);
           rc.ConsultaRaza("razas", "nombre", cmbRaza, raza);
            txtColorMascota.setText(color);
            txtObservacionesEditarMascota.setText(observaciones);
        } else {
            // Manejar el caso en el que no se haya seleccionado ninguna fila
            JOptionPane.showMessageDialog(this, "Selecciona una fila antes de editar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarMascotaActionPerformed

    private void btnModificarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMascotaActionPerformed
        // Verifica si hay una edición pendiente de mascota
    if (edicionPendienteMascota) {
        DefaultTableModel model = (DefaultTableModel) jTableMascotas.getModel();
        int selectedRow = jTableMascotas.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado un registro en la tabla Mascotas para modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            // Obtén los valores editados desde tus campos de edición
            String nuevoNombreMascota = txtNombreEditarMascota.getText();
            String nuevoColor = txtColorMascota.getText();
            String nuevasObservaciones = txtObservacionesEditarMascota.getText();

            // Obtén el valor seleccionado en cmbRaza
            String nuevaRaza = cmbRaza.getSelectedItem().toString();

            // Obtén los valores originales de la fila seleccionada
            String nombreMascotaOriginal = jTableMascotas.getValueAt(selectedRow, 0).toString();
            String razaOriginal = jTableMascotas.getValueAt(selectedRow, 1).toString();
            String colorOriginal = jTableMascotas.getValueAt(selectedRow, 2).toString();
            String observacionesOriginales = jTableMascotas.getValueAt(selectedRow, 5).toString();

            // Verifica si ha habido cambios
            if (!nuevoNombreMascota.equals(nombreMascotaOriginal) || !nuevaRaza.equals(razaOriginal)
                    || !nuevoColor.equals(colorOriginal) || !nuevasObservaciones.equals(observacionesOriginales)) {

                // Ha habido cambios, actualiza la fila en la tabla
                jTableMascotas.setValueAt(nuevoNombreMascota, selectedRow, 0);
                jTableMascotas.setValueAt(nuevaRaza, selectedRow, 1);
                jTableMascotas.setValueAt(nuevoColor, selectedRow, 2);
                jTableMascotas.setValueAt(nuevasObservaciones, selectedRow, 5);

                boolean modificacionExitosa = modificarRegistroEnBaseDeDatosMascota(
                        nombreMascotaOriginal, razaOriginal, colorOriginal, observacionesOriginales,
                        nuevoNombreMascota, nuevaRaza, nuevoColor, nuevasObservaciones);

                if (modificacionExitosa) {
                    JOptionPane.showMessageDialog(null, "Registro de Mascota modificado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modificar el registro de Mascota en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Limpia los campos de texto después de la modificación
                txtNombreEditarMascota.setText("");
                txtColorMascota.setText("");
                txtObservacionesEditarMascota.setText("");

                // Restablece edicionPendienteMascota a false después de la modificación
                edicionPendienteMascota = false;
            } else {
                // No ha habido cambios, muestra un mensaje informativo
                JOptionPane.showMessageDialog(null, "No se han realizado cambios en el registro de Mascota", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } else {
        // Muestra un mensaje de advertencia si no se ha realizado una edición pendiente de mascota
        JOptionPane.showMessageDialog(null, "No se ha realizado ninguna edición pendiente de Mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarMascotaActionPerformed
    private boolean modificarRegistroEnBaseDeDatosMascota(
            String nombreMascotaOriginal, String razaOriginal, String colorOriginal,
            String observacionesOriginales,
            String nuevoNombreMascota, String nuevaRaza, String nuevoColor,
            String nuevasObservaciones) {

        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            // Conectar a la base de datos
            conn = Conexion.obtenerConexion();

            // Sentencia SQL para actualizar el registro en la tabla de mascotas
            String sql = "UPDATE mascotas SET nombre = ?, raza = ?, color = ?, observaciones = ?"
                    + "WHERE nombre = ? AND raza = ? AND color = ? AND observaciones = ?";

            // Preparar la sentencia SQL
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nuevoNombreMascota);
            preparedStatement.setString(2, nuevaRaza);
            preparedStatement.setString(3, nuevoColor);
            preparedStatement.setString(4, nuevasObservaciones);
            preparedStatement.setString(5, nombreMascotaOriginal);
            preparedStatement.setString(6, razaOriginal);
            preparedStatement.setString(7, colorOriginal);
            preparedStatement.setString(8, observacionesOriginales);

            // Ejecutar la sentencia SQL
            int filasActualizadas = preparedStatement.executeUpdate();

            // Comprobar si se actualizó al menos una fila
            if (filasActualizadas > 0) {
                // Si se actualizó con éxito, retorna true
                return true;
            }
        } catch (SQLException e) {
            // Manejar las excepciones adecuadamente, puedes mostrar un mensaje o registrar el error
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el PreparedStatement y la conexión
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                // Manejar las excepciones al cerrar la conexión
                e.printStackTrace();
            }
        }

        // Si llegamos aquí, la modificación falló, retorna false
        return false;
    }

    private boolean modificarRegistroEnBaseDeDatos(String nombreOriginal, String celularOriginal, String nuevoNombre, String nuevoCelular) {

        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            // Conectar a la base de datos
            conn = Conexion.obtenerConexion();

            // Sentencia SQL para actualizar el registro en la tabla de dueños
            String sql = "UPDATE duenos SET nombre = ?, celular = ? WHERE nombre = ? AND celular = ?";

            // Preparar la sentencia SQL
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setString(2, nuevoCelular);
            preparedStatement.setString(3, nombreOriginal);
            preparedStatement.setString(4, celularOriginal);

            // Ejecutar la sentencia SQL
            int filasActualizadas = preparedStatement.executeUpdate();

            // Comprobar si se actualizó al menos una fila
            if (filasActualizadas > 0) {
                // Si se actualizó con éxito, retorna true
                return true;
            }
        } catch (SQLException e) {
            // Manejar las excepciones adecuadamente, puedes mostrar un mensaje o registrar el error
            e.printStackTrace();
        } finally {
            try {
                // Cerrar el PreparedStatement y la conexión
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                // Manejar las excepciones al cerrar la conexión
                e.printStackTrace();
            }
        }

        // Si llegamos aquí, la modificación falló, retorna false
        return false;

    }

    private void cargarDatosMascotasEnTabla() {
        try {
            // Conectar a la base de datos
            Connection conn = Conexion.obtenerConexion();

            // Crear una consulta SQL que une las tablas "mascotas" y "duenos" para obtener el nombre del dueño
            String sql = "SELECT m.nombre, m.raza, m.color, m.alergico, m.atencion_especial, m.observaciones, d.nombre AS nombreDueno "
                    + "FROM mascotas m "
                    + "INNER JOIN duenos d ON m.num_cliente = d.id_dueno";

            // Ejecutar la consulta SQL
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Limpiar el modelo de tabla antes de cargar nuevos datos
            DefaultTableModel model = (DefaultTableModel) jTableMascotas.getModel();
            model.setRowCount(0);

            // Iterar a través de los resultados y agregar filas a la tabla Swing
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String raza = resultSet.getString("raza");
                String color = resultSet.getString("color");
                String alergico = resultSet.getString("alergico");
                String atencionEspecial = resultSet.getString("atencion_especial");
                String observaciones = resultSet.getString("observaciones");
                String nombreDueno = resultSet.getString("nombreDueno");

                model.addRow(new Object[]{nombre, raza, color, alergico, atencionEspecial, observaciones, nombreDueno});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener los datos de mascotas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error al obtener los datos de mascotas: " + e.getMessage());
        }
    }

    private void cargarDatosDuenosEnTabla() {
        try {
            // Conectar a la base de datos
            Connection conn = Conexion.obtenerConexion();

            // Crear una consulta SQL que obtenga los dueños y la cantidad de mascotas por dueño
            String sql = "SELECT d.nombre, d.celular, COUNT(m.id_mascota) AS cantidad_mascotas "
                    + "FROM duenos d "
                    + "LEFT JOIN mascotas m ON d.id_dueno = m.num_cliente "
                    + "GROUP BY d.nombre, d.celular";

            // Ejecutar la consulta SQL
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Limpiar el modelo de tabla antes de cargar nuevos datos
            DefaultTableModel model = (DefaultTableModel) jTableDuenos.getModel();
            model.setRowCount(0);

            // Iterar a través de los resultados y agregar filas a la tabla Swing
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String celular = resultSet.getString("celular");
                int cantidadMascotas = resultSet.getInt("cantidad_mascotas");

                model.addRow(new Object[]{nombre, celular, cantidadMascotas});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener los datos de dueños: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error al obtener los datos de dueños: " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarMascota;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarMascota;
    private javax.swing.JToggleButton btnVolverInicio;
    private javax.swing.JComboBox<String> cmbRaza;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDuenos;
    private javax.swing.JTable jTableMascotas;
    private javax.swing.JTextField txtCelularEditarDueno;
    private javax.swing.JTextField txtColorMascota;
    private javax.swing.JTextField txtNombreEditarDueno;
    private javax.swing.JTextField txtNombreEditarMascota;
    private javax.swing.JTextArea txtObservacionesEditarMascota;
    // End of variables declaration//GEN-END:variables
}
