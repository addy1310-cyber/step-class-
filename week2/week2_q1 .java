import java.util.*;
public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    float n1,n2;
    System.out.println("Enter two nos : ");
    n1=sc.nextFloat();
    n2=sc.nextFloat();
    float sum = n1 + n2 ;
    float diff = n1 - n2 ;
    float prod = n1 * n2 ;
    float div = n1 / n2 ;
    System.out.println(" the addition , substraction , multiplication and div of the given nos : "+sum +" "+diff+" "+prod+" "+div);
      
}