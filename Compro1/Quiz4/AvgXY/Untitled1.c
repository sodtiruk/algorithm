#include <stdio.h>

void main(){
    int size;
    scanf("%d", &size);
    double sum = 0;
    int count = 0;
    int arr[size];
    for(int i=0; i<size; i++){
        scanf("%d", &arr[i]);
    }
    int x, y;
    scanf("%d%d", &x, &y);

    for(int i=0; i<size; i++){
        if (arr[i] >= x && arr[i] <= y){
            sum += arr[i];
            count++;
        }
    }
    if (count == 0){
        printf("0\nnone");
    }else {
        printf("%d\n%.2f", count, sum/count);
    }
}
