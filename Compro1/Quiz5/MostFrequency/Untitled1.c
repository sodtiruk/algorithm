#include <stdio.h>

int A[1000000][2];
void main(){
    int count = 0, size = 0;
    while(1){
        int x;
        scanf("%d", &x);
        if (x <= 0){
            break;
        }
        count++;

        int isFound = 0;
        for(int r=0; r<size; r++){
            if (x == A[r][0]){
                isFound = 1;
                A[r][1]++;
            }
        }

        if (isFound == 0){
            A[size][0] = x;
            A[size][1] = 1;
            size++;
        }

    }
    int max = 0;
    for(int r=0; r<size; r++){
        if (A[r][1] > max){
            max = A[r][1];
        }
    }
    printf("%d\n", count);

    for(int r=0; r<size; r++){
        if (A[r][1] == max){
            printf("%d ", A[r][0]);
        }
    }
}
