import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        // declaracion de variables tipo int
        int numero;
        int numeroSecreto = 0;
        int intentos = 0;
        while (intentos <= 10) {
            intentos = intentos + 1;
            numeroSecreto =(int) (Math.random()*100);
            System.out.println("ingrese un número");
            numero = lectura.nextInt();
            if (numero == numeroSecreto) {
                System.out.println("usted gano y sus intentos fueron:  " + intentos + " y el número secreto es: " + numeroSecreto);
                intentos = 10;
            } else if (numero < numeroSecreto) {
                System.out.println("El número es mayor a: " + numero + " intentos: " + intentos);
            } else if (numero > numeroSecreto) {
                System.out.println("El número es menor a: " + numero + " intentos: " + intentos);
            }
        }

        System.out.println("Lo siento no losgraste adivinar el número secreto era: " + numeroSecreto + " y sus intentos fueron: " + intentos);
        lectura.close();
    }
}
