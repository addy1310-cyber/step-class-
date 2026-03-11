import java.util.*;
public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
        double km;
        System.out.println("enter the distance in km: ");
        double dist_km=sc.nextDouble();
        double dist_miles= dist_km/1.6;
        System.out.println("The value of miles is :  " + dist_miles + "for the given distance in km: "+dist_km);
    }
