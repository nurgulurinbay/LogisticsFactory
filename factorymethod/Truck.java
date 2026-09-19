package factorymethod;

public class Truck implements Transport {

    @Override
    public void deliver(String destination, String cargo) {
        System.out.println("Truck is delivering " + cargo + " to " + destination + ".");
    }
}
