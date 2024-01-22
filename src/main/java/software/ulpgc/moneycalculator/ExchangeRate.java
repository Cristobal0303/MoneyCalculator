package software.ulpgc.moneycalculator;

import software.ulpgc.moneycalculator.Currency;

import java.time.LocalDate;

public record ExchangeRate(Currency from, Currency to, LocalDate date, double rate) {


}
