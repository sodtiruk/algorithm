#include <stdio.h>

struct student{
    int score[6];
}typedef Student;

void main(){
    int n,k;
    scanf("%d%d", &n, &k);
    Student A[n];

    for(int i=0; i<n; i++){
        for(int j=0; j<k; j++){
            scanf("%d", &A[i].score[j]);
        }
    }

    int sum = 0;
    int max = -2000000000;
    int whohighscore;
    for(int i=0; i<n; i++){
        for(int j=0; j<k; j++){
            sum += A[i].score[j];
        }
        if (sum > max){
            max = sum;
            whohighscore = i;
        }
        sum = 0;
    }

    int count = 0;
    for(int i=0; i<k; i++){
        int flag = 0;
        for(int j=0; j<n; j++){
            if (A[j].score[i] > A[whohighscore].score[i]){
                flag = 1;
            }
        }
        if (flag == 0){
            count++;
        }
    }

    printf("%d\n%d", max, count);

}
