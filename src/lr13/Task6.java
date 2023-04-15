package lr13;

public class Task6 {
        public static void main(String[] args) {
            int[] array = new int[1000];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 1000);
            }
            final long[] sum = {0};
            Thread[] threads = new Thread[Runtime.getRuntime().availableProcessors()];
            for (int i = 0; i < threads.length; i++) {
                int finalI = i;

                threads[i] = new Thread(() -> {
                    long sumLocal = 0;
                    for (int j = finalI * array.length / threads.length; j < (finalI + 1) * array.length / threads.length; j++) {
                        sumLocal += array[j];
                    }
                    synchronized (Task3.class) {
                        sum[0] += sumLocal;
                    }
                });
                threads[i].start();
            }
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sum[0]);
        }
}
