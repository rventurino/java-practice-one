package Two;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city + " ");
        }
        System.out.println();
        BigInteger[] hugeNumbers = {new BigInteger("234534589348590128")};
        new BigInteger("435235242345234");
        new BigInteger("4234542223");
        Arrays.sort(hugeNumbers);
        for(BigInteger number : hugeNumbers){
            System.out.println(number + " ");
        }
    }
}
