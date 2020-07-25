

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main
{
    public static void main( String[] args )
    {
        final Logger log=LogManager.getLogger(Main.class);
        Scanner sc=new Scanner(System.in);
        log.info("Enter Principal");
        double principal=sc.nextDouble();
        log.info("Enter time");
        double time=sc.nextDouble();
        log.info("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        log.info("Is automated ?");
        boolean automated=sc.nextBoolean();
        log.info("Enter material");
        String material=sc.next();
        log.info("Enter area");
        double area=sc.nextDouble();
        Interest s =new Interest(principal,rate_of_interest,time);
        double simple_interest=s.simple_interest();
        log.info("Simple Interest : "+simple_interest);
        double compound_interest=s.compound_interest();
        log.info("Compound Interest : "+compound_interest);
        Construction con =new Construction(automated, material, area);
        double cost=con.construction_cost();
        log.info("Total Cost : "+cost);
        sc.close();
    }
}