package second;

import java.math.BigDecimal;

public class SalaryAccount extends PaymentAccount{
    @Override
    public BigDecimal balance(String numberAccount) {
        return super.balance(numberAccount);
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        super.refill(numberAccount, sum);
    }

    @Override
    public void payment(String numberAccount, BigDecimal sum) {
        super.payment(numberAccount, sum);
    }
}
