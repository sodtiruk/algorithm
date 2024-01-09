#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int left = n;
    int middle = n+1;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(j==0){
                printf("%d", left);
            } else {
                printf("  ");
            }
            if (i == j){
                printf("%d", middle);
            }else {
                printf("");
            }
        }
        middle++;
        left--;
        printf("\n");
    }
}
