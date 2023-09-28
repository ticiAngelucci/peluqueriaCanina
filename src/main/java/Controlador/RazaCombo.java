/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class RazaCombo {
    public void ConsultaRaza(String tabla, String valor, JComboBox combo, String elementoPrimero) {
        String sql = "SELECT nombre FROM razas";
        Statement st;
        System.out.print("llegue1");
        try {
            st = Conexion.obtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            combo.removeAllItems();

            if (elementoPrimero != null) {
                combo.addItem(elementoPrimero);
            }

            if (!rs.next()) {
                System.out.println("El ResultSet está vacío.");
                return; // Sal del método si no hay datos
            }

            do {
                String nombreRaza = rs.getString(valor);

                // No agregues el elemento primero nuevamente
                if (nombreRaza.equals(elementoPrimero)) {
                    continue;
                }

                System.out.println(nombreRaza);
                combo.addItem(nombreRaza);
            } while (rs.next());

            // Después de agregar elementos, actualiza la interfaz gráfica
            combo.revalidate();
            combo.repaint();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
}
