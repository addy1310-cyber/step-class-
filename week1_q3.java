import java.util.*;
 public class week1_q3{
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);  
      System.out.println("enter the distance in km:");
      double dist=sc.nextDouble();
       double distmiles= dist*1.6;
       System.out.println("distance in miles: "+distmiles);

    }
}