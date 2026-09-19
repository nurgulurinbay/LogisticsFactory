package abstractfactory;

public class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Linux button.");
    }
}
