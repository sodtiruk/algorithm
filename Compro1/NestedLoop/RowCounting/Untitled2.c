#include <stdio.h>

void main(){
    int count = 1;
    int r,c;
    scanf("%d%d", &r, &c);
    for(int i = 1; i <= r; i++){
        for(int j = 1; j <= c; j++){
            if (count <= r*c){
                printf("%d ", count);
                count++;
            }
        }
        printf("\n");
    }
}
