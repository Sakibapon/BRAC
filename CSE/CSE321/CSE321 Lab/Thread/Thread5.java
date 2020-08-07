
public class Thread5 implements Runnable{
 
 public synchronized void run() {
  for(int i=0; i< 10; i++) {
   System.out.println(Thread.currentThread().getName() + " " + i);
   
   /*try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }*/
  }
 }
 
 public static void main(String[] args) {
  Thread t1 = new Thread(new Thread5(), "Thread 1");
  Thread t2 = new Thread(new Thread5(), "Thread 2");
  
  t1.start();
  t2.start();
 }
}

