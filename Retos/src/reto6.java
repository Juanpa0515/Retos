import java.util.Scanner;
                                                                                
public class reto6 {
                                                                                
    public static void main(String[] args) throws Exception {
 //Declaración de variables tipo int
        int tipoCara;
        int tiroAleatorio;
        int tope=100000;
        int apuesta=0;
        int i=0;
        int cantidad=0;
     //Declaración de variables tipo string
        String nombre;
                                                                                   
        System.out.println("juego del carillerazo");
       
        Scanner lectura=new Scanner(System.in);
    /*Se imprime un mensaje pidiendo los datos */
        System.out.println("ingrese su nombre");
        nombre=lectura.nextLine();

                                                                                     
        System.out.println("Porfavor ingrese la cantidad de veces que quiere jugar");
        cantidad=lectura.nextInt();
        tiroAleatorio=(int) (Math.random()*2)+1;
    // hacemos un bucle con for
        for(i=0;i<cantidad;i++){ 
                                                                                      
                                                                                    
        System.out.println("cuanto va apostar");
        apuesta=lectura.nextInt();
                                                                                     
        System.out.println("tira una moneda, cara:1 y sello:2");
        tipoCara=lectura.nextInt();
        tiroAleatorio=(int) (Math.random()*2)+1;                                      
       
    //ponemos una condicion
          if (tiroAleatorio == 1 && tipoCara == 1) {
                //hago una comparcion entre la consola y la eleccion de la persina
                System.out.println("salio cara ");
                System.out.println(nombre + " has ganado la respuesta de la maquina es " + 
                tiroAleatorio + " la tuya es " + tipoCara+ " tu valor fina es  " + (tope + apuesta));
            } else if (tiroAleatorio == 2 && tipoCara == 2) {
                System.out.println("salio sello ");
                System.out.println(nombre + " has ganado la respuesta de la maquina es " + 
                tiroAleatorio + " la tuya es " + tipoCara+ " tu valor fina es  " + (tope + apuesta));
            } else if (tiroAleatorio == 1 && tipoCara == 2) {
                System.out.println(" salio cara ");
                System.out.println(nombre + " has perdido la respuesta de la maquina es " +
                 tiroAleatorio + " la tuya es "+ tipoCara + " tu valor fina es  " + (tope - apuesta));
            } else if (tiroAleatorio == 2 && tipoCara == 1) {
                System.out.println("salio sello ");
                System.out.println(nombre + "has perdido la respuesta de la maquina es " +
                 tiroAleatorio + " la tuya es "+ tipoCara + " tu valor fina es  " + (tope - apuesta));
            }
            
        }                                                                             
        System.out.println( nombre+ " usted ha jugado " +cantidad+ " rondas , su tope final es de " + tope);                                                           
        // se imprime un mensaje que diga "gracias por juagar"
System.out.println("Gracias por jugar");

       //Limpiar Buffer
lectura.close();
}
}








       /*  if(tiroAleatorio==1 && tipoCara==1){
            System.out.println(nombre+ "; Empate respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es" + tipoCara + "y tu valor final es" + apuesta);
        }

                                                                                      
        else if(tiroAleatorio==1 && tipoCara==2){
            System.out.println(nombre+", Salio sello has perdido la respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es" + tipoCara + "y tu valor final es de:" + (tope-apuesta));
        }

        else if(tiroAleatorio==2 && tipoCara==1){
            System.out.println(nombre+", Salio cara has ganado la respuesta de la maquina fue:" + tiroAleatorio + "tu respuesta es" + tipoCara + "y tu valor final es de:" +(tope+apuesta));
        }

        else if(tiroAleatorio==2 && tipoCara==2){
            System.out.println(nombre+", Empate respuesta de la maquina fue:" + tiroAleatorio + ", tu respuesta es:" + tipoCara + ", y tu valor final es:" + apuesta );
        }

         }*/
        