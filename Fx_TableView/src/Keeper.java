public class Keeper {

    private String KeeperName;
    private String KeeperPens;

    public Keeper(){
        this.KeeperName = "";
        this.KeeperPens = "";

    }

    public Keeper (String keeperName, String keeperPens){
        this.KeeperName = keeperName;
        this.KeeperPens = keeperPens;
    }

    public String getKeeperName() {

        return KeeperName;
    }

    public void setKeeperName(String keeperName) {

        this.KeeperName = keeperName;
    }

    public String getKeeperPens(){
        return KeeperPens;
    }

    public void setKeeperPens(String keeperPens) {
        this.KeeperPens = keeperPens;
    }

}
