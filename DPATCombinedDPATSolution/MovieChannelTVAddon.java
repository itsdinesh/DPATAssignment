package DPATCombinedDPATSolution;

public class MovieChannelTVAddon extends Decorator{
    private final int addonprice = 25;

    public MovieChannelTVAddon(TVAddonCustomisation tvc) {
        super(tvc);
    }
    
    public int getPrice() {
        return tvc.getPrice() + addonprice;
    }
    
    public String getDesc() {
        return tvc.getDesc() + " + Movie Channels (RM" + addonprice + ")";
    }
}
