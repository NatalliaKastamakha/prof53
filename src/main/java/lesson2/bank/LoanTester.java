package lesson2.bank;

public class LoanTester {
    public static void main(String[] args) {

        LoanTaker misha = new LoanTaker("Misha", 21_000, 73);
        LoanIssuer dina = new LoanIssuer("Dina", true, false);

        System.out.println(dina.toIssue(misha));

        //foma ne leniwyj i zloj

        LoanTaker alex = new LoanTaker( "Alex", 26_000, 30);
        LoanIssuer foma = new LoanIssuer( "Foma", false, false);
        System.out.println(foma.toIssue(alex));

    }




}
