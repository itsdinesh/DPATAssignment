package DPATCombinedDPATSolution;

public class TVPackageFactory {
    TVPackage tp;
    
    public TVPackage selectTVPackage(String ptype) {       
        switch(ptype){
            case "1":
                tp = new StarterPack();
                break;
            case "2":
                tp = new FamilyPack();
                break;
            case "3":
                tp = new UltraPack();
                break;
        }
        return tp;
    }   
}