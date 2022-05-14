import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class CoinClass {

    private String coin;
    private int amount;

    private CoinClass(String coin, int amount){
        this.setCoin(coin);
        this.setAmount(amount);
    }

    private void setCoin(String coin){
        if(coin.equals("gp") || coin.equals("sp") || coin.equals("cp")){
            this.coin = coin;
        } else {
            this.coin = "unknown coin";
        }
    }
    private String getCoin(){
        if(coin.equals("gp") || coin.equals("sp") || coin.equals("cp")){
            return this.coin;
        } else {
            return "unknown coin";
        }
    }

    private void setAmount(int amount) {
        if (!getCoin().equals("unknown coin")) {
            this.amount = amount;
        } else {
            this.amount = 0;
        }
    }
    private int getAmount(){
        return this.amount;
    }

    public static CoinClass gp = new CoinClass("gp", 0);
    public static CoinClass sp = new CoinClass("sp", 0);
    public static CoinClass cp = new CoinClass("cp", 0);
    static CoinClass pp = new CoinClass("pp", 1000);

    public static void main(String[] args) {
        System.out.println(pp.getCoin()+" " + pp.getAmount());
    }


}
