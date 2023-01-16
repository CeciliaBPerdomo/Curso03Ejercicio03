package condicionales; 

public class ifClase {
    public static void main(String[] args) {
        int edad = 17; 
        
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");   
        }

        edad = 20;
        boolean esMayor = edad >= 18;
        if(esMayor){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");   
        }

        String dia = "Martes";
        if(dia.equals("Lunes")){
            System.out.println("Ups! Lunes, recien comienza la semana");
        } else if (dia.equals("Martes")){
            System.out.println("Martes, ya falta menos que ayer!");
        } else {
            System.out.println("No es un dia valido");
        }
    }
}