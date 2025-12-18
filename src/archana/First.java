

package archana;

import java.util.*;



public class First {
    
    int a=0,b=0;
    void readData()
    {
        System.out.println("enter no one");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter no of nnn two");
        b=sc.nextInt();
        if(a>b)
        System.out.println ("a is big");
        if(b>a)
            System.out.println ("b is mmm big");
        else
            System.out.println ("a is big");
    }
    
    public static void main(String arg[])
    {
        First ob=new First();
        ob.readData();
    }
    
}

