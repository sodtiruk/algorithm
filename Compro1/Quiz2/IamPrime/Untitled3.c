#include <stdio.h>

void main(){
    int x;
    scanf("%d", &x);
    if (x % 2 == 0){
        if (x == 2){
            printf("2 is prime");
        } else {
            printf("%d is not prime", x);
        }
    } else {
        int isprime = 1; // 1 = no , 0 = yes
        for (int i = 3; i<=x/4; i+=2){
            if(x % i == 0){
                isprime = 0;
                break;
            }
        }
        if (isprime == 1){
            printf("%d is prime", x);
        } else {
            printf("%d is not prime", x);
        }
    }
}
