package repeticion;

public class BuclesFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            System.out.println("El valor de la variable i es: " + i);
        }

        String[] nombres = {"Pepe", "Juanito", "Ruperta"};
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int[] numeros = {5, 7, 8, 11};
        int suma = 0;
       
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
            System.out.println("Suma: " + suma);
        }
    }
}
