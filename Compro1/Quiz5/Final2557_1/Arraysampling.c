#include <stdio.h>

int A[1000][1000];
int B[1000];
void main(){
    int n;
    scanf("%d", &n);
    int sum = 0;
    int check = 0;
    int ee = 0;
    int max = -2000000000;
    int min = 2000000000;

    for(int i=0; i<n; i++){
        int x;
        scanf("%d", &x);
        for(int j=0; j<x; j++){
            scanf("%d", &A[i][j]);
            ee++;
        }
        B[i] = ee;
        ee = 0;
    }

    //printf("%d\n", B[2]);
    //printf("Check is : %d\n", A[4][0]);
    while(1){
        int d1, d2;
        scanf("%d", &d1);
        if (d1 == 0){
            break;
        }

        scanf("%d", &d2);

        if (d2 >= B[d1-1] && d1 > n){
            check++;
        }else if (d2 >= B[d1-1]){
            check++;
        }else if (d1 > n){
            check++;
        }

        if (max <= A[d1-1][d2]){
            max = A[d1-1][d2];
        }else if (A[d1-1][d2] == 0){
            continue;
        }
        if (min >= A[d1-1][d2]){
            min = A[d1-1][d2];
        }else if (A[d1-1][d2] == 0){
            continue;
        }
        sum += A[d1-1][d2];

    }
    printf("%d\n", sum);
    printf("%d\n", max);
    printf("%d\n", min);
    printf("%d\n", check);


}
