#include <stdio.h>
#include <limits.h>

void main(){
    int n,m,x;
    int max = INT_MIN;
    int min = INT_MAX;
    int max_i;
    int min_i;
    int sum = 0;

    scanf("%d%d", &n, &m);
    int Each_m[n];
    for(int i=0; i<n; i++){
        Each_m[i] = 0;
    }

    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            scanf("%d", &x);
            if (x > 10){
                Each_m[j] += 400;
            }else {
                Each_m[j] += 40*x;
            }
        }
    }

    for(int i=0; i<n; i++){
        if (Each_m[i] > max){
            max = Each_m[i];
            max_i = i+1;
        }
        if (Each_m[i] < min){
            min = Each_m[i];
            min_i = i+1;
        }
        sum += Each_m[i];
    }
    printf("%d\n%d\n%d\n", sum, max_i, min_i);

}
