//Practica personal 
//Patricio Arturo Mendez Gonzalez
//26 de junio de 2024

package CifradoCesar;

import java.util.Scanner;

public class Desencriptado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce el mensaje a desencriptar:");
        String mensaje = leer.nextLine();
        System.out.println("Introduce la clave: ");
        int clave = leer.nextInt();
        
        for(int i = 0; i < mensaje.length(); i++){
            char letras = mensaje.charAt(i);
            int ascii = (int) letras;
            int encriptacion = ascii - clave;
            char nuevomensaje = (char) encriptacion;
            System.out.print(nuevomensaje);
        }
  
    }
    
}