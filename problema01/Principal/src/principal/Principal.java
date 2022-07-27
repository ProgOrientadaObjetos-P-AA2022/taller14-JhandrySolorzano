
package principal;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Enlace c = new Enlace();
        Scanner entrada = new Scanner(System.in);
        String res;
        entrada.useLocale(Locale.US);
        do {

            System.out.println("Ingrese la cedula del trabajador: ");
            String ce = entrada.nextLine();
            System.out.println("Ingrese el nombre del trabajador: ");
            String n = entrada.nextLine();
            System.out.println("Ingrese el correo del trabajador: ");
            String co = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador: ");
            double s = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes que trabajo:");
            String m = entrada.nextLine();

            SueldoTrabajador trabajador = new SueldoTrabajador(ce, n, co,
                    s, m);
            c.insertarTrabajador(trabajador);
            //entrada.nextLine();
            System.out.println("Ponga si, para ingresar otro trabajador15: ");
            res = entrada.nextLine().toLowerCase();
        } while (res.equals("si"));
    }

}
