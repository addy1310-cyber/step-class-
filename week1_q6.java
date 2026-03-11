
import java.util.* ;
public class week1_q6 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println(".enter the fee amt :");
            int fee = sc.nextInt();
            int discount=10;
           double final_amt= fee-(fee*(discount/100.0));
            System.out.println("The final amount after discount: "+final_amt);
    }
}

