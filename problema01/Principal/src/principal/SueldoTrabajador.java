/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author User
 */
public class SueldoTrabajador {
     private String cedula;
    private String nombre;
    private String correo;
    private double sueldo;
    private String mes;

    public SueldoTrabajador(String c, String n, String co, double s, String m) {
        cedula = c;
        nombre = n;
        correo = co;
        sueldo = s;
        mes = m;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCorreo(String n) {
        correo = n;
    }

    public void establecerSueldo(double n) {
        sueldo = n;
    }

    public void establecerMes(String n) {
        mes = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMes() {
        return mes;
    }

     @Override
    public String toString(){
        String data = String.format("Cedula: %s\n"
                + "Nombres: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del Sueldo: %s\n",
                obtenerCedula(),
                obtenerNombre(), obtenerCorreo(),
                obtenerSueldo(),obtenerMes());
        return data;
    }
}
