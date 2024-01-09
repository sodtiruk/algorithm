#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int team1[5000];
    int team2[5000];
    int score1 = 0;
    int score2 = 0;

    for(int i=0; i<n; i++){
        scanf("%d", &team1[i]);
    }

    for(int i=0; i<n; i++){
        scanf("%d", &team2[i]);
    }

    for(int i=0; i<n; i++){
        if(team1[i] > team2[i]){
            score1++;
        }else if(team1[i] < team2[i]){
            score2++;
        }
    }
    printf("%d %d\n", score1, score2);
    if(score1 > score2){
        printf("%d", 1);
    }else if(score1 < score2){
        printf("%d", 2);
    }else {
        printf("%d", 0);
    }
}
