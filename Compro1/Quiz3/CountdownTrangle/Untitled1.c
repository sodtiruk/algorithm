#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int star = n;
    int space = 0;
    for (int r=1; r<=n; r++){
        for (int c=1; c<=space; c++){
            printf(" ");
        }
        for (int c=1; c<=star; c++){
            printf("%d", star%10);
        }
        star--;
        space++;
        printf("\n");
    }
}
