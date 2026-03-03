import java.util.*;

public class week1_q4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the cost prince of the product : ");
    double cp = sc.nextDouble();
    System.out.println("Enter the selling price : ");
    double sp=sc.nextDouble();

    if (sp>cp){
        double profit = sp-cp;
        double profit_per= (profit/cp)*100;
        System.out.println("The cost price  :"+cp+"and selling price is :"+sp);
        System.out.println("The profit is :"+profit+"the profit percentage is :"+profit_per);
    }
    else {
        double loss= cp-sp;
        System.out.println("loss"+loss);
    }

    }
}
