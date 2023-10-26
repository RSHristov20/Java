import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zad2 {
    public static void main(String[] args) {

        int start = 1;
        int end = 100;

        int numThreads = 4;

        int intervalSize = (end - start + 1) / numThreads;

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        for (int i = 0; i < numThreads; i++) {
            int subStart = start + i * intervalSize;
            int subEnd = (i == numThreads - 1) ? end : subStart + intervalSize - 1;

            executorService.execute(new PrimeNumberSearchTask(subStart, subEnd));
        }

        executorService.shutdown();
    }

    static class PrimeNumberSearchTask implements Runnable {
        private final int start;
        private final int end;

        PrimeNumberSearchTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    System.out.println(num + " е просто число.");
                }
            }
        }
        private boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            if (num <= 3) {
                return true;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
