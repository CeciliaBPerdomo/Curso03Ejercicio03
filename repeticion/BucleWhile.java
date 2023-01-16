package repeticion;

public class BucleWhile {
    public static void main(String[] args) {
       int contador = 0;
        
        while(contador < 10){
            System.out.println ("El valor de contador es: " + contador);
            contador ++; 
            if(contador == 5){
                // break; 
                continue;
            } 
        }
    }
}
