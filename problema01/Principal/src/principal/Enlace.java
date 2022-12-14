/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/Trabajadores.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarTrabajador(SueldoTrabajador st) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (cedula, "
                    + "nombre, correo, sueldo, mes ) "
                    + "values ('%s', '%s', '%s', '%.2f', '%s')",
                    st.obtenerCedula(), st.obtenerNombre(),
                    st.obtenerCorreo(), st.obtenerSueldo(),
                    st.obtenerMes());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<SueldoTrabajador> obtenerDataSueldos() {
        ArrayList<SueldoTrabajador> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from SueldosTrabajadores;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                SueldoTrabajador miSueldo = new SueldoTrabajador(rs.getString("cedula"),
                        rs.getString("nombre"), rs.getString("correo"),
                        rs.getDouble("sueldo"), rs.getString("mes"));
                lista.add(miSueldo);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
