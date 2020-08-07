class SimpleThread implements Runnable {
    String St;
    public SimpleThread(String st1){
	St=st1;
    }
    public void run() {
	for (int i = 0; i < 10; i++) {
	    System.out.println(i + " " + St);
            try {
		Thread.sleep((int)(Math.random() * 1000));
	    } catch (InterruptedException e) {}
	}
	System.out.println("DONE! " + St);
    }
}

public class ThreadImplement {
    public static void main (String args[]) {
        Thread t1=new Thread(new SimpleThread("Fiji"));
        Thread t2=new Thread(new SimpleThread("Jamaica"));
	t1.setName("Fiji");
	t2.setName("Jamaica");
	t1.start();
	t2.start();
    }
}
