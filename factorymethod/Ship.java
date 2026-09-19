package factorymethod;

public class Ship implements Transport {

    @Override
    public void deliver(String destination, String cargo) {
        System.out.println("Ship is delivering " + cargo + " to " + destination + ".");
    }
}
