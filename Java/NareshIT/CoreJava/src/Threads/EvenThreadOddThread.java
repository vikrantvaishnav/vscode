package Threads;

public class EvenThreadOddThread {


    public void main(){
        child t1 = new child();

        t1.start();

        try{
            t1.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        int count=0;
        IO.println();
        for(int i=1;i<=100;i++){
                if(i%2==0){
                    IO.print(i+" by "+Thread.currentThread().getName()+"\t");
                    count++;
                if(count%5==0){
                    IO.println();
                }
                }
        }
        
    }
}



class child extends Thread{
        @Override
        public void run(){
            int count=0;
    
            for(int i=1;i<=100;i++){
                if(i%2!=0){
                    IO.print(i+" by "+Thread.currentThread().getName()+"\t");
                    count++;
                    if(count %5==0){
                        IO.println();
                    }
                }
            }
        }
    }
