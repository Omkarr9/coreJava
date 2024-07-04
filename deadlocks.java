// a deadlock is a situation where a thread is waiting for an object lock that another thread holds, and 
// this second thread is waiting for object lock that the first thread holds. so they are unable to pass (relinquish) the lock to each other
// both the threads are in the blocked-for-lock-acquisition state

public class deadlocks {
    public static void main(String[] args) {
        // we can use String values as locks since String is wrapper class and not a primitive data type
        String lock1 = "omkar";
        String lock2 = "caraxes";

        // CREATING A DEADLOCK SITUATION REVERSING THE ORDER OF LOCKS THAT EACH SYNCHRONIZED METHOD USES
        
        // Thread thread1 = new Thread(() -> {
        //     synchronized(lock1){ // thread1 accepts lock1 for first synchronized block
        //         try {
        //             Thread.sleep(1);
        //             // for second synchronized block it accepts lock2
        //             synchronized(lock2){  // this will the deadlock state since it accepts lock2 and lock2 is with thread2 and it is waiting for lock 1 which is with thread1
        //             System.out.println("lock acquired");
        //             }
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
                
        //         }
        // }, "thread1");

        // Thread thread2 = new Thread(() -> {
        //     synchronized(lock2){
        //         try{
        //             Thread.sleep(1);
        //             synchronized(lock1){ // 
        //                 System.out.println("Lock acquired");
        //             }
        //         }
        //         catch(Exception e){
        //             System.out.println(e);
        //         }
        //     }
        // }, "thread2");



        // // over come this situation will have set locks order correctyl
        // thread1.start();
        // thread2.start();

        Thread thread11 = new Thread(() -> {
            synchronized(lock1){ // thread1 accepts lock1 for first synchronized block
                try {
                    Thread.sleep(1);
                    // for second synchronized block also accepts lock1
                    synchronized(lock1){  
                    System.out.println("lock acquired");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                }
        }, "thread11");

        Thread thread22 = new Thread(() -> {
            synchronized(lock2){
                try{
                    Thread.sleep(1);
                    synchronized(lock2){ // 
                        System.out.println("Lock acquired");
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }, "thread22");

        thread11.start();
        thread22.start();
    }
}
