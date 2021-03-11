package DPATSimpleSolution;

public class UltraPack extends TVPackage {
    
    private final int baseprice = 20;
    private int addonprice = 0;
    
    public String getDesc() {
        return "Ultra Pack";
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
