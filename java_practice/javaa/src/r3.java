import java.util.Scanner;

public class r3 {
    public void Phone_no() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Phone_no");

        long phone = s.nextLong();

        while(phone>0)
        {
            long number=phone % 10;
            phone=phone/10;
            System.out.print(number);


        }


    }
}
