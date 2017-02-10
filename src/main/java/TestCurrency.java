
public class TestCurrency {

    public static void main(String[] args) {



        double outCash = new TestCurrency().changeCurrency();

        System.out.println(outCash/3.98 + " USD is " + outCash + " PLN");


    }
    public double changeCurrency (){

        double a = 1000;

        return a * 3.98;

    }

}


