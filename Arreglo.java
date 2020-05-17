
package arreglo;

import java.util.Scanner;

/**
 *
 * @author Jackie Piña
 */
public class Arreglo {

    
    public static void main(String[] args) {
       int x=0;
       Scanner entrada = new Scanner(System.in);
       
       int[] Arreglito = new int[10]; //areglo que va almacenar datos
       for(int i=0; i<10; i++)
       {
           System.out.println("Inserta un valor");
           Arreglito[i] = entrada.nextInt();
           
       }
       
        for(int j=1; j<10; j=j+2){
            System.out.println("Posición ["+j+"]"+Arreglito[j]);
            
        }
        
        
    }
    
}
