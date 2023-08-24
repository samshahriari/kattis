#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int height = 0;
    string directions = "";
    cin >> height;
    getline(cin, directions);
    int pointer = 1;
    int elements = pow(2, height + 1);
    for (auto c : directions)
    {
        if (c == 'L')
            pointer *= 2;
        else if (c == 'R')
            pointer = 2 * pointer + 1;
    }
    cout << elements - pointer;
}