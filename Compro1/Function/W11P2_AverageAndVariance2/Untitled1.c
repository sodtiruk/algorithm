#include <stdio.h>

double average(int* array, int n);
double variance(int* array, double avg, int n);

void main(){
    int n;
    scanf("%d", &n);
    int num[n];

    double result;
    double result_variance;
    for(int i=0; i<n; i++){
        scanf("%d", &num[i]);
    }
    result = average(num, n);
    result_variance = variance(num, result, n);
    printf("%.2f %.2f", result, result_variance);
}

double average(int* array, int n){
    double sum = 0;
    for(int i=0; i<n; i++){
        sum += array[i];
    }
    return sum / n;
}

double variance(int* array, double avg, int n){
    double sum = 0;
    for(int i=0; i<n; i++){
        sum += (array[i]-avg) * (array[i]-avg);
    }
    return sum/(n-1);
}
