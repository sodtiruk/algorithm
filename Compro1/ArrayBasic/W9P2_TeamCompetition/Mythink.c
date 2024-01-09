#include <stdio.h>

void main(){
    int x;
    scanf("%d", &x);
    int team_1[x];
    int team_2[x];
    int score_team1 = 0;
    int score_team2 = 0;

    for (int i=0; i<x; i++){ //read team1
        scanf("%d", &team_1[i]);
    }
    for (int i=0; i<x; i++){ //read team2
        scanf("%d", &team_2[i]);
    }

    int t = 0;
    int i = 0;
    while (t<x){ //solve between team1 and team2
        if (team_1[i] > team_2[i]){
            score_team1 += 2;
        }else if (team_2[i] > team_1[i]){
            score_team2 += 2;
        }else {
            score_team1++;
            score_team2++;
        }
        i++;
        t++;
    }

    //printf("%d %d", score_team1, score_team2);

    if (score_team1 > score_team2){ //show who team win and show score team
        printf("Team 1 wins\nScore %d to %d", score_team1, score_team2);
    }else if (score_team2 > score_team1){
        printf("Team 2 wins\nScore %d to %d", score_team2, score_team1);
    }else {
        printf("Draw game\nScore %d to %d", score_team1, score_team2);
    }

}
