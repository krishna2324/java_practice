package Arrays_practice;

public class Basic_array_program2 {
    public  void string_progrm()
    {

      String  a[] =new String[5];
        a[0] = "krishnakanth";
        a[1] = "7569812324";
        a[2] = "krishna";
        a[3] = "kanth";
        a[4] = "Thrymr software";
        for (int i=0;i<=a.length-1;i++)
        {
            if (a[0].equals("krishnakaanth"))
            {
                System.out.println("My name is " + a[0]);
            }
            else
            {
                System.out.println("Your name is not " + a[0]);
            }
        }
   }

    public static void main(String[] args) {
        Basic_array_program2 br=new Basic_array_program2();
        br.string_progrm();
    }
}
