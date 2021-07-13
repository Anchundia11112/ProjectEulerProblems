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