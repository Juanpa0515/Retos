//se importa la clase Scanner
import java.util.Scanner;
//nombre del documento
public class reto4 {
    //class main para ejecutar
    public static void main(String[] args) throws Exception {
        //Declaración de variables tipo int
        int opcion;
        int opcionAleatoria;
        int tope=100000;
        int apuesta=0;
        //Declarar variables tipo String
        String nombre;
        //se imprime un mensaje pidiendo los datos
        System.out.println("piedra, papel o tijera");

        //Scanner para capturar los datos
        Scanner registrar=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        nombre = registrar.nextLine();
        System.out.println("opciones: piedra:1, papel:2, tijera:3");
        opcion=registrar.nextInt();
        System.out.println("cuanto va a apostar");
        apuesta=registrar.nextInt();
        opcionAleatoria=(int) (Math.random()*3)+1;
        //crear condición
        if(opcionAleatoria==1 && opcion==1){
            System.out.println("respuesta piedra");
            System.out.println("empate");
        }
        else if(opcionAleatoria==2 && opcion==1){
            System.out.println("respuesta piedra");
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ 
            opcionAleatoria + " tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope-apuesta));
        }
        else if(opcionAleatoria==3 && opcion==1){
            System.out.println("respuesta es piedra");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ 
            opcionAleatoria +" tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope+apuesta));
        }
        else if(opcionAleatoria==2 && opcion==2){
            System.out.println("respuesta papel");
            System.out.println("empate");
        }
        else if(opcionAleatoria==1 && opcion==2){
            System.out.println("respuesta papel");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ 
            opcionAleatoria +"tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope+apuesta));
        }
        else if(opcionAleatoria==3 && opcion==2){
            System.out.println("respuesta papel");
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ 
            opcionAleatoria +"tu respuesta es: " + opcion+" y tu valor final es de:"+ (tope-apuesta));
        }
        else if(opcionAleatoria==3 && opcion==3){
            System.out.println("respuesta tijera");
            System.out.println( "empate");
        }
        else if(opcionAleatoria==2 && opcion==3){
            System.out.println("respuesta tijera");
            System.out.println( nombre+" has ganado la respuesta de la maquina es: "+ 
            opcionAleatoria +"tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope+apuesta));
        }
        else if(opcionAleatoria==1 && opcion==3){
            System.out.println( nombre+" has perdido la respuesta de la maquina es: "+ 
            opcionAleatoria +"tu respuesta es: " + opcion +" y tu valor final es de:"+ (tope-apuesta));
        }
        System.out.println("!Gracias por jugar¡"); 

        //Limpiar Buffer
        registrar.close();
    }
}

