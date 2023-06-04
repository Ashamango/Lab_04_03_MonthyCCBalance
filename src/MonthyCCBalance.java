// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MonthyCCBalance {
    public static void main(String[] args) {
        //
        double creditBalance = 5000;
        double firstInterest = 0;
        double secondInterest = 0;
        firstInterest = creditBalance * 0.17;
        System.out.println("The interest due after month one is " + firstInterest);
        secondInterest = (firstInterest + creditBalance) * 0.17;
        System.out.println("The interest due after month two is " + secondInterest);
    }
}