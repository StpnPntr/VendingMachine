import java.util.Scanner;

public class CoinAcceptor {
    public int balanceCalculation(int balance){
        String coin;
        Scanner scanner = new Scanner(System.in);
        coin = scanner.nextLine();
        if (coin.equals("Accept")) return -1;
        balance += Integer.parseInt(coin);
        return balance;
    }
}
