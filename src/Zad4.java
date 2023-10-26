import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Zad4 {
    public static void main(String[] args) {
        int numTables = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(numTables);

        for (int i = 1; i <= numTables; i++) {
            Table table = new Table(i);
            executorService.execute(table);
        }

        executorService.shutdown();
    }

    static class Table implements Runnable {
        private int tableNumber;

        Table(int tableNumber) {
            this.tableNumber = tableNumber;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Маса " + tableNumber + " - Клиент идва и седи.");

                    int consumptionTime = (int) (Math.random() * 10) + 1;
                    TimeUnit.SECONDS.sleep(consumptionTime);

                    System.out.println("Маса " + tableNumber + " - Клиент завърши и освобождава масата.");

                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
