package hw13_matrixGeneration;


    import java.util.Random;

    public class MatrixThreads {

        public static void main(String[] args) {

            System.out.println("start");
            long startGenerate = System.nanoTime();
            double[][] matrix = generate();
            long stopGenerate = System.nanoTime();
            System.out.println("Matrix generation time = " + (stopGenerate - startGenerate));

            System.out.println("generated");
            long start = System.nanoTime();
            process(matrix);
            long stop = System.nanoTime();
            System.out.println("Elapsed = " + (stop - start));

        }

        private static void process(double[][] matrix) {

            Thread[] threads = new Thread[matrix.length];

            for (int i = 0; i < matrix.length; i++) {
                final double[] row = matrix[i];
                threads[i] = new Thread() {
                    @Override
                    public void run() {
                        processRow(row);
                    };
                };
                threads[i].start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private static void processRow(double[] ds) {
            for (int i = 0; i < ds.length; i++) {
                Math.pow(ds[i], ds[i]);
            }
        }

        private static double[][] generate() {

            double[][] matrix = new double[10][1_000_000];
            Random random = new Random();

            Thread[] generateThreads = new Thread[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                final double[] row = matrix[i];
                generateThreads[i] = new Thread() {
                    @Override
                    public  void run() {
                        for (int j = 0; j < row.length; j++) {
                            row[j] = random.nextDouble();
                        }
                    };
                };
                generateThreads[i].start();

            }
            for (Thread generateThread : generateThreads) {
                try {
                    generateThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return matrix;
        }

    }

