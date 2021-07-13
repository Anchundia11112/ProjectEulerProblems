/*
*  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
*  The sum of these multiples is 23.
*
*  Find the sum of all the multiples of 3 or 5 below 1000.
*
*  [MA] 07/12/2021 - Started and finished question 1
*/

import java.util.ArrayList;

class euler1 {
    public static void main(String[] args) {
        int sumOfMultiples = SumOfMultiplesOfThreeAndFive();
        System.out.println("Final Sum of multiples of 3 and 5 is: " + sumOfMultiples);
    }

    public static int SumOfMultiplesOfThreeAndFive() {
        ArrayList<Integer> listOfNaturalNumbers = new ArrayList<Integer>();
        int finalSum = 0;
        
        //Create the list of numbers from 0 to 999 since I already solved this a while back in C++
        for(int i = 0; i < 1000; i++) {
            listOfNaturalNumbers.add(i);
        }

        for(int numbers: listOfNaturalNumbers) {
            if(numbers % 3 == 0 || numbers % 5 == 0) {
                finalSum += numbers;
            }
        }

        return finalSum;
    }
}