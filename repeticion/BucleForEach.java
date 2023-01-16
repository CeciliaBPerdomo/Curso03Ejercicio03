package repeticion;

public class BucleForEach {
    public static void main(String[] args) {
       
        String[] nombres = {"Pepe", "Juanito", "Ruperta"}; 
        for(String nombre: nombres){
            System.out.println(nombre);
        }

        System.out.println(" "); 

        int[] numeros = {5, 7, 8, 11};
        int suma = 0;
        for (int numero: numeros){
            System.out.println("Numero: " + numero);
            suma += numero;
            System.out.println("Va sumando: " + suma);
        }
       
    }
}
