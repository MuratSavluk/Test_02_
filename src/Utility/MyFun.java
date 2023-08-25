package Utility;

public class MyFun {
    public static void Wait(int sn){
        try {
            Thread.sleep(sn * 1000l);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
