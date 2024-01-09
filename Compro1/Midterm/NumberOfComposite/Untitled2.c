#include <stdio.h>

int main(){
    int N;
    scanf("%d", &N);
    int count = 0;
    if (N == 2){
        count = 2;
    }else {
        for (int i = 1; i <= N; i++){
            if (N % i == 0){
                count++;
            }
        }
    }
    if (count == 2){
        printf("%d is prime", N);
    }else {
        printf("%d", count);
    }
}
