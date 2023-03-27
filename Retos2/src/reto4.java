/* Haciendo uso de matrices desarrolle un programa que permita simular las siguientes acciones de una maquina expendedora
de dulces con capacidad para 16 productos: 

- Permita llenar la máquina con 16 nombres de productos y su respectivo precio.
- Muestre el catálogo de productos con el código del producto (posición), nombre y precio de cada producto ingresado. */

import java.util.Scanner;

public class reto4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String [][] nombres = new String [4][4]; 
        int [][] precios = new int [4][4];
    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite el nombre del producto que esta en el codigo "+i+j);
                nombres[i][j] = leer.next();
                System.out.println("Digite el precio del producto que esta en el codigo "+i+j);
                precios[i][j] = leer.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i+""+j+"\t");
                System.out.print(nombres[i][j]+"\t");
                System.out.print(precios[i][j]+"\t");
            }
            System.out.println();
        }

    leer.close();
    }

}
        