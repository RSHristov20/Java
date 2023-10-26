import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zad1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> {
            System.out.println("Задача 1");
        });

        executorService.execute(() -> {
            System.out.println("Задача 2");
        });

        executorService.execute(() -> {
            System.out.println("Задача 3");
        });

        executorService.shutdown();
    }
}
