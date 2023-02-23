package Arrays_practice;

public class Bassic_array_prgm1 {
    public static void main(String[] args) {
      basic();

    }
    public static void basic()
    {
        int[] age = new int[5];

        age[0] = 12;
        age[1] = 4;
        age[2] = 5;
        age[3] = 6;
        age[4] = 7;

        for (int i=0;i<= age.length-1;i++)
        {
            System.out.println("index "+i +" "+age[i]);
        }

    }



}
