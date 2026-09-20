package module3.Q1;

public class EvenNumbers extends Thread{
    public void run(){  
        try{ 
            for(int i = 2; i <= 20; i++){
            if(i % 2==0) {
                 System.out.println(i + " is even Number");
                 Thread.sleep(500);
            }    
        }
    }catch (InterruptedException e){
            System.out.println(e);            
        }
    }
 }



