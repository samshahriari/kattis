#include <iostream>

using namespace std;

int main()
{
    int num_tests;
    string schedule;

    cin >> num_tests;
    cin >> schedule;

    int lectures = 0;
    int coffee_left = 0;

    for (char lect : schedule)
        if (lect == '1')
        {
            lectures++;
            coffee_left = 2;
        }
        else if (coffee_left > 0)
        {
            coffee_left--;
            lectures++;
        }
    cout << lectures << endl;
}