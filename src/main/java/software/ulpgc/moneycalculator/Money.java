package software.ulpgc.moneycalculator;

import software.ulpgc.moneycalculator.Currency;

public record Money(long amount, Currency currency) {
    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
