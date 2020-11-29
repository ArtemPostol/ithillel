package third_lesson;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class LoanClassicDecimal {
    public static void main(String[] args) {
        BigDecimal creditSum = new BigDecimal("50000");
        BigDecimal annualInterestRate = new BigDecimal("0.22");
        BigDecimal loanTerms = new BigDecimal("12");
        MathContext context = new MathContext(17, RoundingMode.HALF_DOWN);
        BigDecimal overpaymentAmount = new BigDecimal("0");

        BigDecimal repaymentLoanBody = creditSum.divide(loanTerms, context);
        System.out.println(("Сумма, которая идёт на погашение тела кредита = " + repaymentLoanBody));

        for (int i = 0; i < 12; i++) {
            BigDecimal repaymentLoanBodyPerMonth = repaymentLoanBody.multiply(new BigDecimal(i));
            BigDecimal balancePayable = creditSum.subtract(repaymentLoanBodyPerMonth);
            BigDecimal balancePayableWithPercents = balancePayable.multiply(annualInterestRate);
            BigDecimal repayCalculationPeriod = balancePayableWithPercents.divide(loanTerms, context).stripTrailingZeros();
            System.out.println(i + 1 + " расчётный период. Сумма, которая идёт на погашение процентов по кредиту = " + repayCalculationPeriod);
            overpaymentAmount = overpaymentAmount.add(repayCalculationPeriod, context);
        }
        System.out.println("Сумма переплаты за 12 месяцев " + overpaymentAmount);
    }
}
