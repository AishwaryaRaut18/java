/*Create multi threaded java application --- having 3 threads
main , even , odd.

Create EvenPrinterTask  & OddPrinterTask
Accept from user (in main thread)-- start & end values.
Pass these values from main to child threads
Even no printer thread  should print even nos within specified range, with small delay (sleep)
Odd no printer thread should print odd nos within specified  range , with small delay (sleep)

Solve above using  implements Runnable scenario & confirm the concurrency

*/package thread;
import java.util.Scanner;	
public class MultiThread {
    boolean odd;
    int count = 1;
    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                while (!odd) {
                    try {
                          wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }
 
    public void printEven() {
 
        try {
            Thread.sleep(100);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {

                while (odd) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();
 
            }
        }
    }  
    Scanner sc=new Scanner(System.in);
    
 int MAX=sc.nextInt();
    public static void main(String[] args) {
  System.out.println("Enter number");
    	
        MultiThread multi = new MultiThread();
        multi.odd = true;
        Thread t1 = new Thread(new Runnable() {
 
            @Override
            public void run() {
                multi.printEven();
 
            }
        });
        Thread t2 = new Thread(new Runnable() {
 
            @Override
            public void run() {
                multi.printOdd();
 
            }
        });
 
        t1.start();
        t2.start();
 
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
 
