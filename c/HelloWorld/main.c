#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "Portuguese");

    printf("Ol� Mundo!");

    getc(stdin);
    return 0;
}
