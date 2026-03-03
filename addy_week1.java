import java.util.*;
public class addy_week1{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter Harry's date of birth : ");
    int dob=sc.nextInt();
    System.out.println("enter current year ");
    int current_year=sc.nextInt();

    int age = current_year-dob;
    System.out.println("Harry's age :"+age);


        
    }
}
