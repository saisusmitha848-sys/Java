class work implements Runnable
{
     public void run()
    {
        for (int i = 1; i < 5; i++) 
        {
            System.out.println("Laps:"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }    
        }
    }
}
public class Multithread_Interface
{
    public static void main(String [] args)
    {
        work W = new work();
        Thread T1 = new Thread(W);
        T1.start();
    
         for (int i = 1; i < 13; i++) 
        {
            System.out.println("HeadCount:"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }    
        }       
    }
}