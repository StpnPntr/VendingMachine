import java.util.Scanner;

public class BaseClass {


    public static void main(String[] args) {

        Product twix = new Product("Twix", 50, 1);
        Product snik = new Product("Snik", 40, 2);
        Product boun = new Product("Boun", 45, 3);
        Product coca = new Product("Coca", 42, 4);
        Product chok = new Product("Chok", 55, 5);
        Product shue = new Product("Shue", 60, 6);
        Product ppsh = new Product("Ppsh", 65, 7);
        Product spsh = new Product("Spsh", 75, 8);
        Product ldpr = new Product("Ldpr", 50, 9);
        Product frog = new Product("Frog", 69, 10);
        Product monke = new Product("Monke", 70, 11);
        Product[] products = new Product[]{twix, snik, boun, coca, chok, shue, ppsh, spsh, ldpr, frog, monke};
        CoinAcceptor ca = new CoinAcceptor();
        int balance = 0;
        int balance2 = 0;
        System.out.println("Insert Coin _________ Balance = 0");
        System.out.println("Enter \"Accept\" if you are ready to order.");
        do {
            balance = ca.balanceCalculation(balance);
            if (balance == -1) break;
            balance2 = balance;
            System.out.println("Insert Coin _________ Balance = " + balance);
            System.out.println("Enter \"Accept\" if you are ready to order.");
        } while (true);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("---====  ====  ====  ====  ====  ====  ====  ====  ====  ====  ====---");
        System.out.println("---|T |  |S |  |B |  |C |  |C |  |S |  |P |  |S |  |L |  |F |  |M |---");
        System.out.println("---|w |  |n |  |o |  |o |  |h |  |h |  |p |  |p |  |D |  |r |  |o |---");
        System.out.println("---|i |  |i |  |u |  |c |  |o |  |u |  |s |  |s |  |P |  |o |  |n |---");
        System.out.println("---|x |  |k |  |n |  |a |  |k |  |e |  |h |  |h |  |R |  |g |  |ke|---");
        System.out.println("---====  ====  ====  ====  ====  ====  ====  ====  ====  ====  ====---");
        System.out.println("---1 x0  2 x0  3 x0  4 x0  5 x0  6 x0  7 x0  8 x0  9 x0  10 x0 11 x0--");
        System.out.println("-------------------/Enter product number to select/-------------------");
        InputPanel ip = new InputPanel();
        int[] productsCounter = new int[11];
        do {
            try {

                if (ip.orderSelection(productsCounter) == -1) break;
                System.out.println("----------------------------------------------------------------------");
                System.out.println("---====  ====  ====  ====  ====  ====  ====  ====  ====  ====  ====---");
                System.out.println("---|T |  |S |  |B |  |C |  |C |  |S |  |P |  |S |  |L |  |F |  |M |---");
                System.out.println("---|w |  |n |  |o |  |o |  |h |  |h |  |p |  |p |  |D |  |r |  |o |---");
                System.out.println("---|i |  |i |  |u |  |c |  |o |  |u |  |s |  |s |  |P |  |o |  |n |---");
                System.out.println("---|x |  |k |  |n |  |a |  |k |  |e |  |h |  |h |  |R |  |g |  |ke|---");
                System.out.println("---====  ====  ====  ====  ====  ====  ====  ====  ====  ====  ====---");
                System.out.println("---1 x" + productsCounter[0] + "  2 x" + productsCounter[1] + "  3 x" + productsCounter[2] + "  4 x" + productsCounter[3] + "  5 x" + productsCounter[4] + "  6 x" + productsCounter[5] + "  7 x" + productsCounter[6] + "  8 x" + productsCounter[7] + "  9 x" + productsCounter[8] + "  10 x" + productsCounter[9] + " 11 x" + productsCounter[10] + "--");
                System.out.println("-------------------/Enter product number to select/-------------------");
                System.out.println("----------------/Enter \"Accept\" to confirm the order/-----------------");
            } catch (Exception e) {
                System.out.println("Value out of range");
            }
        }
        while (true);
        System.out.println("Enter \"Accept\" to confirm the order or \"Refuse\" to take refund");
        Scanner sc = new Scanner(System.in);
        int cost = twix.getPrice()*productsCounter[twix.getPlace()-1]+snik.getPrice()*productsCounter[snik.getPlace()-1]+boun.getPrice()*productsCounter[boun.getPlace()-1]+coca.getPrice()*productsCounter[coca.getPlace()-1]+chok.getPrice()*productsCounter[chok.getPlace()-1]+shue.getPrice()*productsCounter[shue.getPlace()-1]+ppsh.getPrice()*productsCounter[ppsh.getPlace()-1]+spsh.getPrice()*productsCounter[spsh.getPlace()-1]+ldpr.getPrice()*productsCounter[ldpr.getPlace()-1]+frog.getPrice()*productsCounter[frog.getPlace()-1]+monke.getPrice()*productsCounter[monke.getPlace()-1];
        if (sc.nextLine().equals("Accept")){
            if (balance2<cost){
                System.out.println("Not ehough money, order cancelled");
                ip.orderCancel(balance2);
            }
            else ip.orderConfirm(products, productsCounter, cost, balance2);
        }
        else ip.orderCancel(balance2);

    }
}
