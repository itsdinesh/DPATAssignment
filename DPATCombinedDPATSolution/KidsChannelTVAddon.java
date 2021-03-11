package DPATCombinedDPATSolution;

public class KidsChannelTVAddon extends Decorator{
    private final int addonprice = 10;

    public KidsChannelTVAddon(TVAddonCustomisation tvc) {
        super(tvc);
    }

    public int getPrice() {
        return tvc.getPrice() + addonprice;
    }

    public String getDesc() {
        return tvc.getDesc() + " + Kids Channels (RM" + addonprice + ")";
    }
}
