package Controlador;

import java.sql.*;
import javax.swing.JComboBox;
import Modelo.Servicio;
import javax.swing.JOptionPane;

public class ServiciosCombo {
    
    public void ConsultaServicio(String tabla, String valor, JComboBox combo) {
        String sql = "SELECT nombre FROM servicios";
        Statement st;
        System.out.print("llegue1");
        try {
            st = Conexion.obtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Limpia el JComboBox antes de agregar nuevos elementos
            combo.removeAllItems();

            // Verifica si el ResultSet está vacío
            if (!rs.next()) {
                System.out.println("El ResultSet está vacío.");
                return; // Sal del método si no hay datos
            }

            // Bucle para imprimir los valores en System.out y agregarlos al JComboBox
            do {
                String nombreServicio = rs.getString(valor);
                System.out.println(nombreServicio);
                combo.addItem(nombreServicio);
            } while (rs.next());

            // Después de agregar elementos, actualiza la interfaz gráfica
            combo.revalidate();
            combo.repaint();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
    
}
