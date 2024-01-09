#include <stdio.h>

double average(int* array);
double variance(int* array, double avg);

void main(){
    int a[8];
    double result;
    double result_variance;
    for(int i=0; i<8; i++){
        scanf("%d", &a[i]);
    }
    result = average(a);
    result_variance = variance(a, result);
    printf("%.2f %.2f", result, result_variance);
}

double average(int* array){
    double sum = 0;
    for(int i=0; i<8; i++){
        sum += array[i];
    }
    return sum / 8;
}

double variance(int* array, double avg){
    double sum = 0;
    for(int i=0; i<8; i++){
        sum += (array[i]-avg) * (array[i]-avg);
    }
    return sum/7;
}
