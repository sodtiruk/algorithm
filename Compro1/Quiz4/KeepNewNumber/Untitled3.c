#include <stdio.h>

int arr[1000000];

void main(){
    int count = 0, size = 0;
    while(1){
        int x;
        scanf("%d", &x);
        if (x <= 0){
            break;
        }
        count++;
        // check
        int isFound = 0; // 0 = not found, 1 = found
        for(int i=0; i<size; i++){
            if (x == arr[i]){
                isFound = 1;
            }
        }
        // add
        if (isFound == 0){
            arr[size] = x;
            size++;
            //printf("%d\n", x);
        }
    }
    printf("%d\n%d\n", count, size);
    for(int i=0; i<size; i++){
        printf("%d ", arr[i]);
    }
}
