package abstractfactory;

public class GUIClient {

    public void createUI(GUIFactory factory) {

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}