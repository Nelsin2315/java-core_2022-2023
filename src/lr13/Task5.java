package lr13;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        final int[] max = {0};
        Thread[] threads = new Thread[Runtime.getRuntime().availableProcessors()];
        for (int i = 0; i < threads.length; i++) {
            int finalI = i;
            threads[i] = new Thread(() -> {
                int maxLocal = 0;
                for (int j = finalI * array.length / threads.length; j < (finalI + 1) * array.length / threads.length; j++) {
                    if (array[j] > maxLocal) {
                        maxLocal = array[j];
                    }
                }
                synchronized (Task2.class) {
                    if (maxLocal > max[0]) {
                        max[0] = maxLocal;
                    }
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
        System.out.println(max[0]);
    }
}
