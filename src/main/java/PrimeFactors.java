import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {




    public List<Integer> generate(int number){
        List<Integer> primeFactors = new ArrayList<>();
        int checkPrimeNumber = 2;
        for (int i = 0; i <= number ; i++) {
            //the 1 isn't prime number.
            if (number == 1)
                break;
            // it increases for finding prime number
            while (number % checkPrimeNumber != 0)
                checkPrimeNumber++;
            // If It finds prime number, It divides number for accessing true result.
            while(number % checkPrimeNumber == 0)
               number = number / checkPrimeNumber;

            //It adds prime factor to list
            primeFactors.add(checkPrimeNumber);

            }
        return primeFactors;
        }
    }
