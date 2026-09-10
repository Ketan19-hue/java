 // user defined thread by extending Thread class

class invalidAgeException extends RuntimeException{
    invalidAgeException(String msg){
        super(msg);
  
    }
}
class validateAge extends Thread{
    int age=10;

    public void run(){
        if(age<18){
            // System.out.println("Not Eligible to Vote");
            throw new invalidAgeException("Not Eligible to Vote");
        }
        else{
            System.out.println("Eligible to Vote");
        }
    }
}

public class ThreadExample{
    public static void main(String[]args){
        validateAge t1 = new validateAge();
        t1.start();
    }
}
}
