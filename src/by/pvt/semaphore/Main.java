package by.pvt.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Autobus autobus1 = new Autobus("BMW", semaphore);
        Autobus autobus2 = new Autobus("TRIO", semaphore);
        Autobus autobus3 = new Autobus("RDT", semaphore);

        autobus1.run();
        autobus2.run();
        autobus3.run();
    }
}
