import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        // declarar variables
        int perecedero, i, n, suma = 0;
        double subtotales = 0, total1, total2, iva = 0.19;
        String nombreEmpleado, nombreCliente;
        int docCliente;

        // instanciar clase
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo del empleado : ");
        nombreEmpleado = lectura.nextLine();

        System.out.println("Ingrese el nombre completo del cliente");
        nombreCliente = lectura.nextLine();
        System.out.println("Ingrese el documento del cliente ");
        docCliente = lectura.nextInt();
        System.out.println("Cuantos productos desea digitar");
        n = lectura.nextInt();
        // crear el bucle
        for (i = 1; i <= n; i++) {
            System.out.println("Digite precio del producto " + i);
            perecedero = lectura.nextInt();
            suma = suma + perecedero;
        }
        System.out.println("El empleado que atendio su compra es: " + nombreEmpleado);
        System.out.println();
        System.out.println("Cliente " + nombreCliente);
        System.out.println();
        System.out.println("con número de documento : " + docCliente);
        System.out.println();

        subtotales = suma;
        System.out.println("Lleva " + n + "  productos");
        System.out.println();
        System.out.println("El subtotal de su compra es " + subtotales);

        total1 = subtotales * iva;
        total2 = total1 + subtotales;
        System.out.println("El total de su compra es: " + total2);

        lectura.close();
    }
}