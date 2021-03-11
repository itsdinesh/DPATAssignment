package DPATSimpleSolution;

public class StarterPack extends TVPackage { 
    
    private final int baseprice = 30;
    private int addonprice = 0;
    
    public String getDesc() {
        return "Starter Pack";
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
