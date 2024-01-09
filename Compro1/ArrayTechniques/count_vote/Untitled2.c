#include <stdio.h>

void main(){
    int k,n;
    int max = 0;
    int supermax = -2000000000;
    int number;
    scanf("%d%d", &k, &n);
    int A[n];
    for(int i=0; i<n; i++){
        scanf("%d", &A[i]);
    }

    for(int i=1; i<=k; i++){ //check which number maximum
        for(int j=0; j<n; j++){
            if(A[j] == i){
                max++;
            }
            if(max > supermax){
                supermax = max;
                number = i;
            }
        }
        max = 0; //reset max because find next max
    }
    printf("%d\n%d", number, supermax);
}
