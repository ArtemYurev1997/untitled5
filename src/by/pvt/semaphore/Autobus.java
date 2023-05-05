package by.pvt.semaphore;

import java.util.concurrent.Semaphore;

public class Autobus implements Runnable {
    private String name;
    private Semaphore semaphore;

    public Autobus(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Автобус " + name + " останавливается на остановке \"Площадь Ленина\"");
        try {
            semaphore.acquire();
            for(int i = 0; i < 10; i++) {
                System.out.println("автобус едет " + i + " раз");
            }
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
