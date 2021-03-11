package DPATSimpleSolution;

public class FamilyPack extends TVPackage {   
       
    private final int baseprice = 25;
    private int addonprice = 0;
    
    public String getDesc() {
        return "Family Pack";
    }
    
    public int getPrice() {
        return baseprice + addonprice;
    }

    public int optKidsChannel() {
        this.addonprice = addonprice + 10;
        return getPrice();
    }

    public int optMovieChannel() {
        this.addonprice = addonprice + 25;
        return getPrice();
    }
            
    public int optSportsChannel() {
        this.addonprice = addonprice + 25;
        return getPrice();
    }
}
