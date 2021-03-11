package DPATCombinedDPATSolution;

import java.util.Scanner;

public class DPATDesignPatternSolution {
    public static void main(String[] args) {
        TVAddonCustomisation tvc;
        TVPackageFactory tpf = new TVPackageFactory();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("----- ORISSA CABLE TV PACKAGES (DPAT COMBINED SOLUTION) -----" +
                "\n1. Starter Pack (Base Package + Movie Channels)" + 
                "\n2. Value Pack (Base Package + Movie + Kids Channels)" +
                "\n3. Ultra Pack (Base Package + Movie + Kids + Sport Channels)" +
                "\nEnter your selection by typing the corresponding TV package number: "
                );
        
        String ptype = sc.nextLine();
        TVPackage tvpackage = tpf.selectTVPackage(ptype);

        System.out.println("\n----- ORISSA TV PACKAGE PRICING CALCULATION -----");

        //Price Breakdown Switch Case based on Chosen TV Package
        switch(ptype){
            case "1": //RM30 + RM25 = RM 55
                System.out.println("TV Package Type: " + tvpackage.getDesc());
                System.out.println("Base TV Package Price (Includes Public + News Channels): RM" + tvpackage.getPrice());
                tvc = new MovieChannelTVAddon(tvpackage);
                System.out.println("Package Add-on(s): " + tvc.getDesc() + "\nTotal TV Package Price with Add-on(s): RM" + tvc.getPrice());
                break;
            case "2": //RM25 + RM25 + RM 10 = RM 60
                System.out.println("TV Package Type: " + tvpackage.getDesc());
                System.out.println("Base TV Package Price (Includes Public + News Channels): RM" + tvpackage.getPrice());
                tvc = new KidsChannelTVAddon((new MovieChannelTVAddon(tvpackage)));
                System.out.println("Package Add-on(s): " + tvc.getDesc() + "\nTotal TV Package Price with Add-on(s): RM" + tvc.getPrice());
                break;
            case "3": //RM 20 + RM25 + RM 10 + RM 25 = RM 80
                System.out.println("TV Package Type: " + tvpackage.getDesc());
                System.out.println("Base TV Package Price (Includes Public + News Channels): RM" + tvpackage.getPrice());
                tvc = new SportsChannelTVAddon((new KidsChannelTVAddon((new MovieChannelTVAddon(tvpackage)))));
                System.out.println("Package Add-on(s): " + tvc.getDesc() + "\nTotal TV Package Price with Add-on(s): RM" + tvc.getPrice());
                break;
            default:
                System.out.println("\nThe selected TV Package does not exist in the system!");
        }
    }
}
