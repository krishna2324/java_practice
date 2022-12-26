import java.util.Scanner;

public class r2 {
    public void Last_name()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Last_name");
        String Last_name=s.nextLine();

        char chrr2[]=Last_name.toCharArray();

        for(int i=Last_name.length()-1;i>=0;i--)
        {
            System.out.print(chrr2[i]);
        }
        System.out.println(" ");
}

}
