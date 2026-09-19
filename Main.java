import abstractfactory.GUIClient;
import abstractfactory.GUIFactory;
import abstractfactory.LinuxFactory;
import abstractfactory.WindowsFactory;
import factorymethod.ShipFactory;
import factorymethod.Transport;
import factorymethod.TransportFactory;
import factorymethod.TruckFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("=== Design Patterns Demo ===");
            System.out.println("1. Factory Method - Transport");
            System.out.println("2. Abstract Factory - GUI");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice == 1) {
                runTransportDemo(scanner);
            } else if (choice == 2) {
                runGUIDemo(scanner);
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    private static void runTransportDemo(Scanner scanner) {

        System.out.println();
        System.out.println("=== Logistics Transport System ===");
        System.out.println("1. Truck");
        System.out.println("2. Ship");

        System.out.print("Choose transport: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        TransportFactory factory;

        if (choice == 1) {
            factory = new TruckFactory();
        } else if (choice == 2) {
            factory = new ShipFactory();
        } else {
            System.out.println("Invalid transport choice.");
            return;
        }

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter cargo: ");
        String cargo = scanner.nextLine();

        Transport transport = factory.createTransport();

        System.out.println();
        System.out.println("Transport created successfully!");
        transport.deliver(destination, cargo);
    }

    private static void runGUIDemo(Scanner scanner) {

        System.out.println();
        System.out.println("=== GUI Factory ===");
        System.out.println("1. Windows");
        System.out.println("2. Linux");

        System.out.print("Choose platform: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        GUIFactory factory;

        if (choice == 1) {
            factory = new WindowsFactory();
        } else if (choice == 2) {
            factory = new LinuxFactory();
        } else {
            System.out.println("Invalid platform choice.");
            return;
        }

        GUIClient client = new GUIClient();

        System.out.println();
        System.out.println("Creating GUI components...");
        client.createUI(factory);
    }
}