package masivianrefactortest.numeric;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumbers {
    
    public static List<Integer> getFirstNPrimeNumbersBySize(int n){
        List<Integer> primeNumbers = new ArrayList<>(n);
        int number = 0;
	while(primeNumbers.size() < n){
            number++;
            if(isPrime(number)){
                primeNumbers.add(number);
            }    
        }
        
        return primeNumbers;
    }
    
    public static boolean isPrime(int number) {
        
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> (number % n == 0));
    }
    
}
