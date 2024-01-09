#include <stdio.h>

int A1[1000];
int A2[2000];

void main(){
    int n;
    scanf("%d", &n);
    int count = 0;

    for(int i=0; i<n; i++){
        scanf("%d", &A1[i]);
    }

    for(int i=0; i<n; i++){
        scanf("%d", &A2[i]);
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if (A2[j] == A1[i]){
                count++;
            }
        }
    }

    if (count == 0){
        printf("NO");
    }else {
        printf("%d", count);
    }
}
