#include <stdio.h>
int A[2500000];
void main(){
    int N;
    int target_num;
    int count = 0;
    scanf("%d", &N);

    for (int i=0; i<N; i++){
        scanf("%d", &A[i]);
    }
    scanf("%d", &target_num);
    //compare and find position in array
    for(int j=0; j<N; j++){
        if (target_num == A[j]){
            printf("%d ", j+1);
            count++;
        }

    }

    if (count == 0){
        printf("%d", count);
    }

}
