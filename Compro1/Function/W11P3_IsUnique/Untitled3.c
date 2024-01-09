#include <stdio.h>

int isUnique(int* arData, int N){
    int found = 1;
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            if (i != j){
                if (arData[i]==arData[j]){
                    found = 0;
                    return found;
                }
            }
        }
    }
    return found;

}

void main(){
    int n;
    int find_result;
    scanf("%d", &n);
    int arData[n];
    for(int i=0; i<n; i++){
        scanf("%d", &arData[i]);
    }
    find_result = isUnique(arData, n);
    printf("%d", find_result);
}
