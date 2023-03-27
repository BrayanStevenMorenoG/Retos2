import java.util.Scanner;

public class reto2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int n, ganador = 0;

        System.out.println("Cuantos nadadores compitieron?");
        n = leer.nextInt();

        String [] nombres = new String[n];
        int [] tiempos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite el nombre del competidor: "+i);
            nombres[i] = leer.next();
            System.out.println("Digite el tiempo en segundos que tuvo en la competición el competidor "+i);
            tiempos[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("El competidor "+i+" se llama "+nombres[i]+" y se tardo "+tiempos[i]+" en la competición");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            if (tiempos[i] <= tiempos[ganador]) {
                ganador = i;
            }
        }

        System.out.println("El ganador es el competidor " + nombres[ganador] + " con un tiempo de " + tiempos[ganador] + " segundos.");

        leer.close();
    }

}

