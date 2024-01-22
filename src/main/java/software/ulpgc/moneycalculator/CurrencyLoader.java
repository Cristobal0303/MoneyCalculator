package software.ulpgc.moneycalculator;

import software.ulpgc.moneycalculator.Currency;

import java.util.List;

public interface CurrencyLoader {
    List<Currency> load();
}

