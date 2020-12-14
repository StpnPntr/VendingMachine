import java.util.Scanner;

public class InputPanel {
    public int orderSelection(int[] productsCounter){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        if (i.equals("Accept")) return -1;
        productsCounter[Integer.parseInt(i)-1]+=1;
        return 0;
    }
    public void orderConfirm(Product[] products, int[] productsCounter, int cost, int balance){
        YouSpinMeRound ysmr = new YouSpinMeRound();
        System.out.println("Order accepted, take your products and change");
        for(int i = 0; i < productsCounter.length; i++){
            for(int j = 0; j < productsCounter[i]; j++){
                ysmr.productOut(products[i]);
            }
        }
        CoinDispencer cd = new CoinDispencer();
        cd.change(cost, balance);
    }
    public void orderCancel(int balance){
        System.out.println("Order cancelled, take your money");
        CoinDispencer cd = new CoinDispencer();
        cd.returnMoney(balance);
    }

}
