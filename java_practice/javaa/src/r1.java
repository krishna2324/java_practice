import java.util.Scanner;

public class r1 {

    public void First_name() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First_name");
        String First_name = s.nextLine();

        char chrr1[] = First_name.toCharArray();

        for (int i = First_name.length() - 1; i >= 0; i--) {
            System.out.print(chrr1[i]);

        }
        System.out.println(" ");
    }


    }


