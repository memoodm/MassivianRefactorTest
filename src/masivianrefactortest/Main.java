package masivianrefactortest;

/*
* Made by: Guillermo Andres De Mendoza Corrales
* memoodm@gmail.com
* in order to apply to massivian developer position
*/

import java.util.List;
import masivianrefactortest.numeric.PrimeNumbers;
import masivianrefactortest.printer.ConsolePrinter;

public class Main {

    public static void main(String[] args) {
        final int TOTAL_PRIMES_NUMBERS_TO_FIND = 1000;
        final int PRINTER_COLUMNS_BY_PAGE = 4;
        final int PRINTER_ROWS_BY_PAGE = 50;
        List<Integer> primes = PrimeNumbers.getFirstNPrimeNumbersBySize(TOTAL_PRIMES_NUMBERS_TO_FIND);
        ConsolePrinter.consolePrint(primes, PRINTER_ROWS_BY_PAGE, PRINTER_COLUMNS_BY_PAGE);
    }
    
}
