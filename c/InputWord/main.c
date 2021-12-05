#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

#include "libs/utils/input.h"

int main(int arc, char** argv) {
    setlocale(LC_ALL, "Portuguese");
    printf("Projeto de entrada apenas palavras\n");

    char* word = (char*) malloc(sizeof(char) * 33);
//    char* word;

    word = inputWord(33);
    printf("Palavra digitada foi: %s\n", word);

    system("pause");
    return 0;
}
