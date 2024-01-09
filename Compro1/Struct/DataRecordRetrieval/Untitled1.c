#include <stdio.h>

struct student{
    char id[9];
    char name[31];
    char surname[51];
    int year;
} typedef Student;

Student A[20000];

void main(){
    int n;
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%s", &A[i].id);
        scanf("%s", &A[i].name);
        scanf("%s", &A[i].surname);
        scanf("%d", &A[i].year);
    }

    int target;
    scanf("%d", &target);
    int c = 0; // check student
    for(int i=0; i<n; i++){
        if (target == A[i].year){
            printf("%s ", A[i].id);
            printf("%s ", A[i].name);
            printf("%s\n", A[i].surname);
            c++;
        }
    }
    if (c == 0){
        printf("None");
    }
}
