#include <stdio.h>

int main(void)
{
    int input;
    scanf("%d", &input);
    printf(input%2 == 1 ? "Alice\n":"Bob\n");
    return 0;
}