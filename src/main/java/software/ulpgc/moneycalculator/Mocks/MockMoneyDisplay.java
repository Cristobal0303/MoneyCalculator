package software.ulpgc.moneycalculator.Mocks;


import software.ulpgc.moneycalculator.Money;
import software.ulpgc.moneycalculator.MoneyDisplay;

public class MockMoneyDisplay implements MoneyDisplay {
    @Override
    public void show(Money money) {
        System.out.println(money);
    }
}
