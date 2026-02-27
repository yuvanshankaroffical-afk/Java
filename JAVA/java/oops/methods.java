// methods types.
//1.Simple Method (No Parameters)
//2.Method with Parameters
//3.Method with Return Type
//4.Method without Return Type

import java.util.Scanner;
import java.util.*;

public class methods {
    // 1.Simple Method (No Parameters)
    static void greet() 
    { 
        System.out.println("Vanakkam da mapla!"); 
    }
    //2.method with parameters
    static void  add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    //3.method with return type
    static int multiple(int a, int b){
        int c= a*b;
        return c;

    }


    public static void main(String[] args){
        greet();
        //2.
        add(5,6);
        //3.
        int sum = multiple(6,7);
        System.out.println(sum);
        
     }

}
