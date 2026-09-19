package abstractfactory;

public class LinuxCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering Linux checkbox.");
    }
}