import java.util.Scanner;

public class reto1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int n, multiplos=0;

        System.out.println("Cuantos numeros desea digitar?");
        n = leer.nextInt();

        int [] numeros = new int [n];

        for (int i = 0; i < n; i++) {
            
            System.out.println("Ingrese el numero "+i);
            numeros [i] = leer.nextInt();

            if (numeros[i] % 2 == 0) {
                multiplos = multiplos + 1;
            }
        }

        if (multiplos > 0){
            System.out.println("Hay "+multiplos+" numeros multiplos de dos en los numeros que digito");
        } else {
            System.out.println("No hay multiplos de dos");
        }

        leer.close();
    }

}
