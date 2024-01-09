#include <stdio.h>
struct student{
    char name[6];
    int point;
}typedef Student;
Student A[10000];

void main(){
    int n;
    scanf("%d", &n);
    double sum = 0;
    double average;
    for(int i=0; i<n; i++){
        scanf("%s", &A[i].name);
        scanf("%d", &A[i].point);
    }

    for(int i=0; i<n; i++){
        sum += A[i].point;
    }
    average = sum / n;

    int c = 0;
    for(int i=0; i<n; i++){
        if(average < A[i].point){
            c++;
        }
    }
    printf("%d\n", c);

    for(int i=0; i<n; i++){
        if(average < A[i].point){
            printf("%s\n", A[i].name);
        }
    }
}
