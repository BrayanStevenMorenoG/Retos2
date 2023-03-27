import java.util.Scanner;
import java.util.ArrayList;

/* Realizar una matriz con las posiciones que queramos y rellenar. 

Y tiene que mostrarle si hay palabras repetidas y cuales. */

public class reto3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int f,c, esp;

        System.out.println("Digite el numero de filas que desea: ");
        f = leer.nextInt();

        System.out.println("Digite el numero de columnas que desea: ");
        c = leer.nextInt();

        esp = f*c;

        String [][] palabras = new String[f][c];

        System.out.println("La matriz tiene un tamaño de "+esp);

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite la palabra de la posición "+i+","+j);
                palabras [i][j] = leer.next();
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(palabras[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        ArrayList<String> repetidas = new ArrayList<String>();

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                String pala = palabras[i][j];
                if (!repetidas.contains(pala)) {
                    repetidas.add(pala);
                } else {
                    System.out.println("La palabra "+pala+
                    " está repetida");
                }
            }
        }

        leer.close();
    }

}
