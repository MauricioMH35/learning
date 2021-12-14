#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
#include <ctype.h>

// ASCII
// 32 = Espaço em branco
// 13 = Enter
//  8 = Break Space

char* inputWord(int length) {
    char* result = (char*) malloc(sizeof(char) * length);
    char c;
    int i = 0;

    do {
        c = getch();
        if((c != 13 && c != 8 && isalpha(c) != 0) || (c == 32)) {
            result[i] = c;
            i++;
            printf("%c", c);
        }
        else if(c == 8 && i >= 0) {
            result[i] = '\0';
            i--;
            printf("\b \b");
        }
    } while(c != 13);

    result[i] = '\0';
    printf("\n");

    return result;
}
