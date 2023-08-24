#include <iostream>

using namespace std;

int main()
{
    int num_correct_friend;
    string answer;
    string answer_friend;
    int same = 0;
    cin >> num_correct_friend >> answer >> answer_friend;

    for (int i = 0; i < answer.size(); i++)
    {
        if (answer[i] == answer_friend[i])
            same++;
    }
    int different = answer.size() - same;

    if (num_correct_friend > same)
        // cout << same + (answer.size() - num_correct_friend) << endl;
        cout << different + (same - num_correct_friend) << endl;
    else
        cout << num_correct_friend + different << endl;
}