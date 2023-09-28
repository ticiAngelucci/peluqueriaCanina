package Controlador;

import java.sql.*;

public class Conexion {

    private static Connection connection;

    private Conexion() {
        
    }

    public static Connection obtenerConexion() {
        if (connection == null) {
            try {
                
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:/home/luca/Descargas/PeluqueriaCanina/peluqueriaCanina.db");

                if (connection != null) {
                    System.out.println("Conexión a base de datos... Ok");
                } else {
                    System.out.println("Conexión a base de datos: problemas!");
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return connection;
    }

    public static void crearTablas() {
        try {
            Connection conn = obtenerConexion();
            Statement statement = conn.createStatement();

            // Sentencia SQL para crear la tabla de mascotas
            String sqlMascotas = "CREATE TABLE IF NOT EXISTS mascotas ("
                    + "id_mascota INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "nombre TEXT,"
                    + "num_cliente INTEGER,"
                    + "raza TEXT,"
                    + "color TEXT,"
                    + "alergico INTEGER,"
                    + "observaciones TEXT,"
                    + "atencion_especial INTEGER"
                    + ")";
            // Sentencia SQL para crear la tabla de raza
            String sqlRazas = "CREATE TABLE IF NOT EXISTS razas ("
                    + "id_raza INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "nombre TEXT"
                    + ")";

            // Sentencia SQL para crear la tabla de dueños
            String sqlDuenos = "CREATE TABLE IF NOT EXISTS duenos ("
                    + "id_dueno INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "celular TEXT,"
                    + "nombre TEXT"
                    + ")";
            // Sentencia SQL para crear la tabla de turnos
            String sqlTurnos = "CREATE TABLE IF NOT EXISTS turnos ("
                    + "id_turno INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "id_mascota INTEGER,"
                    + "dia TEXT,"
                    + "hora TEXT,"
                    + "observaciones TEXT,"
                    + "id_servicio INTEGER"
                    + ")";
            // Sentencia SQL para crear la tabla de servicios
            String sqlServicios = "CREATE TABLE IF NOT EXISTS servicios ("
                    + "id_servicio INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "nombre TEXT"
                    + ")";

            // Ejecutar las sentencias SQL para crear las tablas
            statement.execute(sqlMascotas);
            statement.execute(sqlDuenos);
            statement.execute(sqlTurnos);
            statement.execute(sqlServicios);
            statement.execute(sqlRazas);

            System.out.println("Las tablas se han creado correctamente.");

            // Cerrar el statement
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al crear las tablas: " + ex.getMessage());
        }
    }
}
