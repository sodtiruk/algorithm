#include <stdio.h>

void main(){
    int size;
    scanf("%d", &size);
    int arr[size];
    for(int i=0; i<size; i++){
        scanf("%d", &arr[i]);
    }
    int m;
    scanf("%d", &m);
    if (m >= 0){ //forward print
        for(int i=0; i<size; i++){
            printf("%d ", arr[i]+m);
        }
    } else { //backward print
        for(int i=size-1; i>=0; i--){
            printf("%d ", arr[i]+m);
        }
    }
}
