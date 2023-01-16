public class Estructuras {
    public static void main(String[] args) {
        // Concatenar texto
        // Crear un bucle que permita concatener textos e imprima el resultado final por consola
        // Los textos pueden venir de un array String
        // String []nombres = {"", "", ""}

        String []nombres = {"Cecilia", "Omar", "Emma", "Bruno", "Camila"};
        String texto = "";

        for(String nombre: nombres){
            texto = texto + " " + nombre; 
        }

        System.out.println(texto);
    }
}