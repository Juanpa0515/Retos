//se importa la clase Scanner
import java.util.Scanner;
//nombre del documento
public class reto1{

//Class main para ejecutar
public static void main(String[ ] args){
    
//Scanner para capturar los datos
Scanner Lectura = new Scanner(System.in);
 
//Declaración de variables tipo double
double gradosFahrenheit,gradosCentigrados,kelvin;

//Se imprime un mensaje pidiendo los datos
System.out.println("ingresé Grados Fahrenheit:");

//Se asigna en la variable gradosCentigrados la operación para realizar 
//la conversion con gradosFahrenheit y de igual manera en la variable kelvin
gradosFahrenheit=Lectura.nextDouble();

gradosCentigrados=(gradosFahrenheit-32)/1.8;

kelvin=((gradosFahrenheit-32)/1.8)+ 273.15;

/*Se imprime el resultado final con las variables incluidas */

System.out.println("Grados Fahrenheit:"+gradosFahrenheit+"Grados Centígrados:"+gradosCentigrados+"Grados Kelvin"+kelvin);

//Limpiar Buffer
Lectura.close();

    }
}
            
