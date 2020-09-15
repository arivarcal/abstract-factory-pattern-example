public class Application {
    public GUIFactory factory;
    public Button button;
    public Checkbox checkbox;

    public Application(GUIFactory factory) {
        // super();
        this.factory = factory;
        createGUI();
    }

    public void createGUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        paint();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
