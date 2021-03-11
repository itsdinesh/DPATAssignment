package DPATCombinedDPATSolution;

public class SportsChannelTVAddon extends Decorator{
    private final int addonprice = 25;

    public SportsChannelTVAddon(TVAddonCustomisation tvc) {
        super(tvc);
    }
    
    public int getPrice() {
        return tvc.getPrice() + addonprice;
    }
    
    public String getDesc() {
        return tvc.getDesc() + " + Sport Channels (RM" + addonprice + ")";
    } 
}
