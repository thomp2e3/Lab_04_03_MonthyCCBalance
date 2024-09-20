public class Main
{
    public static void main(String[] args)
    {
        double cardBalance = 5000 ;
        double interestRate = .017 ;
        double monthOne = 0;
        double monthTwo = 0;

        monthOne = cardBalance * interestRate;
        monthTwo = cardBalance * interestRate + monthOne;

        System.out.println("The interest due after one month is " + monthOne + " and the interest due after two months is " + monthTwo);
    }
}