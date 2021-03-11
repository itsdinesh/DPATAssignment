package DPATSimpleSolution;

import java.util.Scanner;

public class DPATSimpleSolution {
    
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);
        System.out.print("----- CABLE TV PACKAGES -----" +
                "\n1. Starter Pack (Base Package + Movie Channels) | Total: RM55" + 
                "\n2. Family Pack (Base Package + Movie + Kids Channels) | Total: RM60" +
                "\n3. Ultra Pack ((Base Package + Movie + Kids + Sport Channels) | Total: RM80" +
                "\nEnter your selection by typing the corresponding TV package number: "
                );
        String ptype = sc.nextLine();
        System.out.print("\n----- TV PACKAGE PRICING CALCULATION -----");
        
        //Price Breakdown Switch Case based on Chosen TV Package
        switch(ptype){
            case "1": //RM30 + RM25 = RM 55
                StarterPack stp = new StarterPack();
                System.out.println("\nTV Package Type: " + stp.getDesc());
                System.out.println("Base TV Package Price (Includes Public + News Channels): RM" + stp.getPrice());
                System.out.println("Total TV Package Price (Additionally includes Movie Channels): RM" + stp.optMovieChannel());
                break;
              
            case "2": //RM25 + RM25 + RM 10 = RM 60
                FamilyPack fp = new FamilyPack();
                System.out.println("\nTV Package Type: " + fp.getDesc());
                System.out.println("Base TV Package Price (Includes Public + News Channels): RM" + fp.getPrice());
                System.out.println("Total TV Package Price (Additionally includes Movie Channels): RM" + fp.optMovieChannel());
                System.out.println("Total TV Package Price (Additionally includes Kids Channels): RM" + fp.optKidsChannel());
                break;
              
            case "3": //RM 20 + RM25 + RM 10 + RM 25 = RM 80  
                UltraPack up = new UltraPack();
                System.out.println("\nTV Package Type: " + up.getDesc());
                System.out.println("Base TV Package Price (Includes Public + News Channels): RM" + up.getPrice());
                System.out.println("Total TV Package Price (Additionally includes Movie Channels): RM" + up.optMovieChannel());
                System.out.println("Total TV Package Price (Additionally includes Kids Channels): RM" + up.optKidsChannel());
                System.out.println("Total TV Package Price (Additionally includes Sport Channels): RM" + up.optSportsChannel());
                break;
              
            default:
                System.out.println("\nThe selected TV Package does not exist in the system!");
        }
    }
}
