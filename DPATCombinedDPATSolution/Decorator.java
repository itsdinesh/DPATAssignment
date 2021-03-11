package DPATCombinedDPATSolution;

public class Decorator implements TVAddonCustomisation{
    TVAddonCustomisation tvc;

    public Decorator(TVAddonCustomisation tvc) {
        super();
        this.tvc = tvc;
    }
    
    public int getPrice() {
        return tvc.getPrice();
    }
    
    public String getDesc() {
        return tvc.getDesc();
    }
}
