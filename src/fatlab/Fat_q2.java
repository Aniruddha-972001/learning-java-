package fatlab;

import java.util.Scanner;
class thread1 extends Thread{
    int n;
    @Override
     public void run(){
        Fat_q2.hello(n);

    }
    thread1(int n ){
        this.n=n;
    }
}
public class Fat_q2 {
    static synchronized void hello(int n){
        for(int i=1;i<51;i++){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(n*i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        thread1 t1=new thread1(2);
        thread1 t2=new thread1(3);
        thread1 t3=new thread1(4);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
