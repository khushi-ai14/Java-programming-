package module3.Q2;

class  ReverseThread implements Runnable {
    public void run(){
        String str = "MULTITHREADING ";

        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }

}

