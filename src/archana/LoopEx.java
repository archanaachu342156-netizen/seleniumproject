
package archana;
import java.util.*;



public class LoopEx
{
        int a=0;
        void readData()
        {
            System.out.println("enter limit:");
            Scanner sc=new scanner Scanner(System.in);
            a=sc.nextInt();
            for(int i=1;i<=a;i++)
                System.out.println("i is :"+i);
        }
        public static void main(String arg[])
        {
            LoopEx ob=new LoopEx();
            ob.readData();
        }
}

  


