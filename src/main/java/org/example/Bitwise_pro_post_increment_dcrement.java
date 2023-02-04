package org.example;

public class Bitwise_pro_post_increment_dcrement {
    public static void main(String[] args) {
        int n=10;  //n=10
        int a=n++; 
             a++;

//        System.out.println(a);
        if(true) //if(a==n)
        {
            System.out.println("n = "+ n + "  and a = " +a + " both are same ");
        }
        else {
            System.out.println("n = "+ n + "  and a = " +a + " both are not same ");
            System.out.println("n = "+ n + "  and a = " +a + " both are not same ");
        }

    }
}
