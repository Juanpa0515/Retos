/*Se importa la clase Scanner */
import java.util.Scanner;
/*Nombre del documento */
public class reto2 {
    /*Class main para ejecutar */
    public static void main(String[] args) throws Exception {
        /*Scanner para capturar los datos */
        Scanner Lectura = new Scanner(System.in);
        /*Declaración de variables tipo String */
        String nomEnfermera,nomMama,nomBebe;
        /*Declaración de variables tipo float */
        float peso,vacuna,mesesBebe;
        /*Se imprime un mensaje pidiendo los datos */
        System.out.println("Nombre de la enfermera:");
        nomEnfermera=Lectura.nextLine();

        System.out.println("Nombre de la mamá");
        nomMama=Lectura.nextLine();

        System.out.println("Nombre del bebe:");
        nomBebe=Lectura.nextLine();

        System.out.println("Por favor ingrese los meses que tiene el bebe en este momento");
        mesesBebe=Lectura.nextFloat();

        System.out.println("Por favor ingrese el peso que tiene el bebe en este momento");
        peso=Lectura.nextFloat();
        /*Se asigna para la variable vacuna la operación para encontrar la dosis de vacuna del bebe */
        vacuna= (((peso + 10) / (mesesBebe * 10))*8);
         /*Se imprime el resultado final con las variables incluidas */
         System.out.println("El nombre de la enfermera:"+nomEnfermera+", El nombre de la mamá:"+nomMama+", El nombre del bebe:"
         +nomBebe+", La dosis de vacuna para el bebe es:"+vacuna+" ml");
        System.out.println(" la docis de la avcuna a aplicar es " + vacuna+ " ml");
         /*Limpiar Buffer */
         Lectura.close();
        
    }
}


       

   

      