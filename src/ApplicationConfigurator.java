import java.util.Scanner;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Seleccione un sistema operativo:");
        System.out.println("1. Windows");
        System.out.println("2. MacOS");
        
        Scanner entrada = new Scanner(System.in);
        int dato = entrada.nextInt();
        
        GUIFactory factory;
        
        switch (dato) {
            case 1:
                factory = new WinFactory();
                break;
            case 2:
                factory = new MacFactory();
            break;
            default:
                throw new Exception("Error! Opcion desconocida.");
        }

        new Application(factory);
    }
}
