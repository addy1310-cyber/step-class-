
    
import java.util.*;
public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the student fee : ");
    double stud_fee=sc.nextDouble();
    System.out.println("Enter  discount percentage : ");
    int discountPercentage = sc.nextInt();
     double disc_amt = stud_fee*(discountPercentage/100.0);
    double final_fee = stud_fee-disc_amt;
    System.out.println("discount amount in iNR : "+ disc_amt+ "The final discounted fee needed to be paid by the student : "+final_fee);

}
