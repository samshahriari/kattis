#include <iostream>
#include <regex>

using namespace std;
string re;
int cases;
int mem[105][105]; // 1 = true, -1 = false
bool match(int, int, const string &);
int main()
{

    cin >> re;
    cin >> cases;
    string word;
    for (int i = 0; i < cases; i++)
    {
        for (int i = 0; i < 100; i++)
            for (int j = 0; j < 100; j++)
                mem[i][j] = 0;
        cin >> word;

        if (match(0, 0, word))
            cout << word << endl;
    }
}

bool match(int pw, int pr, const string &word)
{
    // använd memoization
    if (mem[pw][pr] != 0)
    {
        return mem[pw][pr] == 1;
    }
    // // slutet på regex och ord
    // if ((pr == re.length()) && pw == word.length())
    // {
    //     mem[pw][pr] = true;
    //     return true;
    // }
    // // slutet på ordet men näst slut på regex med *
    // // slutet på ordet men inte på regex
    // // slutet på regex men inte på ordet
    // if (pr == re.length() && pw != word.length())
    // {

    //     mem[pw][pr] = false;
    //     return false;
    // }
    // någon av pos har gått till slutet, kolla ifall ok!
    if (re.length() == pr || word.length() == pw)
    {
        string new_re = regex_replace(re.substr(pr), regex("\\."), "\\.");
        new_re = regex_replace(new_re, regex("\\*"), ".*");
        string new_word = word.substr(pw);
        // cerr << "testing for " << word << " \"" << new_word << "\""
        //      << " " << new_re << endl;
        mem[pw][pr] = regex_match(new_word, regex(new_re)) ? 1 : -1;
        return mem[pw][pr] == 1;
    }
    if (re[pr] != '*')
    {
        if (re[pr] == word[pw])
        {
            bool found = match(pw + 1, pr + 1, word);
            mem[pw][pr] = found ? 1 : -1;
            return found;
        }
        else
        {
            // cerr << "failed at " << word << " pr " << pr << " pw " << pw << endl;
            mem[pw][pr] = -1;
            return false;
        }
    }
    else
        return match(pw, pr + 1, word) || match(pw + 1, pr + 1, word) || match(pw + 1, pr, word);
}