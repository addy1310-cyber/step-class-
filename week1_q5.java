import java.util.*;

public class week1_q5 {
     public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the total no pens  :");
    int no_pens=sc.nextInt();
    System.out.println("Enter the no of students present :");
    int no_stud=sc.nextInt();

    int pengot = no_pens/no_stud;
    System.out.println("The number of pens each student got :"+pengot);
    int penrem = no_pens%no_stud;
    System.out.println("The number of pens left :"+penrem);
    
}
}