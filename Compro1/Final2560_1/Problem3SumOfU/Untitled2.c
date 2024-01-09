#include <stdio.h>

int num[50000];

void main(){
    int n;
    int count = 0;
    int sum = 0;
    scanf("%d", &n);

    for(int i=0; i<50000; i++){
        num[i] = 0;
    }

    for(int i=0; i<n; i++){
        int x;
        scanf("%d", &x);
        num[x] = x;
    }

    for(int i=0; i<50000; i++){
        if (num[i] > 0){
            count++;
            sum += num[i];
        }
    }
    printf("%d\n%d", count, sum);
}
