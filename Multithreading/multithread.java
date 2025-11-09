public class multithread {
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        
        Thread sumThread = new sum();
        Thread factThread = new fact();

        sumThread.start();
        factThread.start();

        //stop these threads
        try {
            sumThread.join();
            factThread.join();
        } catch (InterruptedException e) {
            System.out.println("Threads interrupted.");
        }

        //show how much time taken
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: "+(endTime - startTime)+"ms");
    }
}
