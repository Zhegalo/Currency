import java.util.Scanner;

/**
 * Created by Hanna_Zhahala on 06.02.2017.
 */
public class Currency {

    public static void main(String[] args) {


        System.out.println("Please, enter initial currency(PLN, USD, EUR):");
        Scanner in = new Scanner(System.in);
        String cur1 = in.nextLine();
        //System.out.println(cur1);

        System.out.println("Please, enter ammount");

        Scanner in1 = new Scanner(System.in);
        int money = in1.nextInt();
        //System.out.println(money);

        System.out.println("Please, enter target currency(PLN, USD, EUR):");
        Scanner in3 = new Scanner(System.in);
        String cur2 = in3.nextLine();
        //System.out.println(cur2);

        double cash = 0;

        if (cur1.equals("PLN")) {

            if (cur2.equals("EUR")) {
                cash = money / 4.22;
            }
            if (cur2.equals("USD")) {
                cash = money / 3.98;
            }
            if (cur2.equals("PLN")) {
                cash = money;
            }
        }

        if (cur1.equals("USD")) {

            if (cur2.equals("EUR")) {
                cash = money / 1.1;
            }
            if (cur2.equals("USD")) {
                cash = money;
            }
            if (cur2.equals("PLN")) {
                cash = money * 3.98;
            }
        }

        if (cur1.equals("EUR")) {

            if (cur2.equals("EUR")) {
                cash = money;
            }
            if (cur2.equals("USD")) {
                cash = money * 1.1;
            }
            if (cur2.equals("PLN")) {
                cash = money * 4.22;
            }
        }

        if (cash != 0){
            System.out.println(cash);}
        else {
            System.out.println("Sorry, you have entered wrong currency or amount");
        }
    }

}
