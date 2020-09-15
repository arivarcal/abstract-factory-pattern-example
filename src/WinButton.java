public class WinButton implements Button {

    public WinButton() {
        // super();
        System.out.println("Botones con estilo Windows");
    }
    @Override
    public void paint(){
        System.out.println("Creando boton de Windows...");
    }
}
