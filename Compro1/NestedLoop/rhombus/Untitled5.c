#include <stdio.h>
/*
OO*OO
O***O
*****
O***O
OO*OO

*/


void main(){
    int n;
    scanf("%d", &n);
    int star = 1;
    int space = n/2;
    //UP
    for (int r = 1; r <= n/2+1; r++){
        for(int c = 1; c <= space; c++){
            printf(" ");
        }
        for (int c = 1; c <= star; c++){
            printf("*");
        }
        star += 2;
        space--;
        printf("\n");
    }
    //DOWN

    space = 1;
    star = n-2;
    for (int r = 1; r <= n/2; r++){
        for (int c = 1; c <= space; c++){
            printf(" ");
        }
        for (int c = 1; c <= star; c++){
            printf("*");
        }
        star -= 2;
        space++;
        printf("\n");
    }
}

