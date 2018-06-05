/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/

#include<iostream>
#include<vector>

int main() {

    std::vector<int> numVect;
    std::vector<int> mult3or5;
    int sum = 0;

    for(int num = 0; num < 1000; ++num) {
        numVect.push_back(num);
        if( (num % 3 == 0) || (num % 5 == 0) )
            mult3or5.push_back(num);            //Vector filled with multiples of 3 or 5;
    }

    std::vector<int>::iterator iter;

    for(iter = mult3or5.begin(); iter != mult3or5.end(); ++iter ) {
        sum += *iter;
    }

    std::cout << sum << std::endl;



    return 0;
}
