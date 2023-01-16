package condicionales;

public class Switch {
    public static void main(String[] args) {

        String dia = "NoValido";
        switch(dia){
            case "Lunes": 
                System.out.println("Hoy es Lunes men!");
                break;
            case "Martes": 
                System.out.println("Hoy es Martes men!");
                break;
            case "Miercoles": 
                System.out.println("Hoy es Miercoles men!");
                break; 
            case "Jueves": 
                System.out.println("Hoy es Jueves men!");
                break;
            case "Viernes": 
                System.out.println("Hoy es Viernes men!");
                break;
            case "Sabado": 
                System.out.println("Hoy es Sabado men!");
                break;
            case "Domingo": 
                System.out.println("Hoy es Domingo men!");
                break;
            default: 
                System.out.println("Escribi lo que quieras, no hay problema.");
                break;
        }
    }
}
