public class ThreadDemo1 extends Thread{
  private String threadName = "";
  
  ThreadDemo1(String name){
    this.threadName = name;
  }
  
  public void run(){
    for(int i=0; i< 10; i++){
      System.out.println(threadName +" : "+ i);
      
      try{
        Thread.sleep(2000);
      }catch(Exception e){
        System.out.println("Exception occured!");
      }
    }
    
    
  }
  
  public static void main(String args[]){
    ThreadDemo1 t1 = new ThreadDemo1("One");
    ThreadDemo1 t2 = new ThreadDemo1("Two");
    t1.start();
    //t2.start();
  }
}