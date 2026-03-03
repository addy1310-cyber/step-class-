import java.util.*;
public class addynew{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the mrks of maths: ");
        int maths = sc.nextInt();
        System.out.println("enter the mrks of chemistry :");
        int chem = sc.nextInt();
        System.out.println("enter the mrks of physics : ");
        int phy = sc.nextInt();

        int avg = (maths+chem+phy)/3;

        System.out.println("the avg of PCM is : "+avg);

    }
}

