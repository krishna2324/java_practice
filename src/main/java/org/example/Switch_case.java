package org.example;

public class Switch_case {
    public void even() {
        int num = 6;
        if (num%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
    public void switch_case()
    {
        int number=16;
        switch (number)
        {
            case 1:
                System.out.println("number is present in case 1 "+number);
                break;
            case 2:
                System.out.println("number is present in case 2 "+ number );
                break;
            case 3:
                System.out.println("number is present in case 3 "+ number );
                break;
            case 4:
                System.out.println("number is present in case 4 "+number);
                break;
            case 5:
                System.out.println("number is present in case 5 "+number);
                break;
            case 6:
                System.out.println("number is present in case 6 "+number);
                break;
            case 7:
                System.out.println("number is present in case 7"+number);
                break;
            default:
                System.out.println("number is not present in any case");

        }
    }
    public void ternary()
    {
        int i=-1,j=2;

        j=i>6?1:2;
        System.out.println(j);
    }
    public static void main(String[] args) {
        Switch_case a=new Switch_case();
        a.even();
        a.switch_case();
        a.ternary();
    }
}
