#include <stdio.h>



void main(){
    int n;
    scanf("%d", &n);
    int space = n-1;
    int spaceinloop = 0;
    for(int i=1; i<=n; i++){
        for(int i=1; i<=space; i++){
            printf(" ");
        }
        printf("*");
        for(int i=1; i<=spaceinloop; i++){
            printf(" ");
        }
        printf("*");
        spaceinloop += 2;
        space--;
        printf("\n");
    }
}
