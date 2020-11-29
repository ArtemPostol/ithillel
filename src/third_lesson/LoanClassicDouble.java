package third_lesson;

public class LoanClassicDouble {
    public static void main(String[] args) {
        double creditSum, annualInterestRate, repaymentLoanBody, loanTerms, repayCalculationPeriod;
        double overpaymentAmount = 0;
        creditSum = 50000;
        annualInterestRate = 0.22;
        loanTerms = 12;

        repaymentLoanBody = creditSum / loanTerms;
        System.out.println("Сумма, которая идёт на погашение тела кредита = " + repaymentLoanBody);

        for (int i = 0; i < 12; i++) {
            repayCalculationPeriod = ((creditSum - (i * repaymentLoanBody)) * annualInterestRate) / loanTerms;
            System.out.println(i + 1 + " расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + repayCalculationPeriod);
            overpaymentAmount += repayCalculationPeriod;
        }
        System.out.println("Сумма переплаты за 12 месяцев " + overpaymentAmount);
    }
}
