import java.util.*;


public class test
{
    public static void main(String[] args) {
    System.out.println(new Date());
    Properties p = System.getProperties();
    p.list(System.out);
    System.out.println("--- Memory Usage:");
    try 
    {
        Thread.currentThread().sleep(5*1000);

    } catch(InterruptedException e) {}
    Runtime rt = Runtime.getRuntime();
    System.out.println("Total Memory = "
                        + rt.totalMemory()
                        + "Free Memory ="
                        + rt.freeMemory());

    }
}
