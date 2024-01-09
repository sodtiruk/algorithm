#include <stdio.h>

void main(){
    int A[250000];
    int n;
    int i = 0;
    while(1){
        scanf("%d", &n);
        if (n < 0 || n > 9){
            break;
        } else {
            A[i] = n;
        }
        i++;
    }
    for (int j=0; j<i; j++){
        int len = j+1;
        //space
        for (int m=1; m<=i-len; m++){
            printf(" ");
        }
        //digit
        for(int k=1; k<=len; k++){
            printf("%d", A[j]);
        }
        printf("\n");
    }

}
