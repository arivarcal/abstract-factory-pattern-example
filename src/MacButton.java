public class MacButton implements Button {
    public MacButton() {
        // super();
        System.out.println("Botones con estilo MacOS");
    }
    @Override
    public void paint(){
        System.out.println("Creando boton de MacOS...");
    }
}
