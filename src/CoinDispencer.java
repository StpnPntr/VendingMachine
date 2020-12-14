public class CoinDispencer {
    public void change(int cost, int balance){
        int change = balance-cost;
        while(change>=10){
            System.out.println(10);
            change-=10;
        }
        while(change>=5){
            System.out.println(5);
            change-=5;
        }
        while(change>=2){
            System.out.println(2);
            change-=2;
        }
        while(change>=1){
            System.out.println(1);
            change-=1;
        }
    }
    public void returnMoney(int balance){
        while(balance>=10){
            System.out.println(10);
            balance-=10;
        }
        while(balance>=5){
            System.out.println(5);
            balance-=5;
        }
        while(balance>=2){
            System.out.println(2);
            balance-=2;
        }
        while(balance>=1){
            System.out.println(1);
            balance-=1;
        }
    }
}
