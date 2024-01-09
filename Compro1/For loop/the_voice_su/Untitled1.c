#include <stdio.h>

void main(){
    int n,k;
    int count1 = 0;
    int count2 = 0;

    scanf("%d %d", &n, &k);

    for (int i = 1; i<=n; i++){
        int g,score1,score2;
        scanf("%d %d %d", &g, &score1, &score2);
        if(g == 1 && score1 > 8 && count1 < k){
            printf("%d 1\n", i);
            count1++;
        }else if(g == 2 && score2 > 8 && count2 < k){
            printf("%d 2\n", i);
            count2++;
        }else if (score1 > 8 && count1 < k){
            printf("%d 1\n", i);
            count1++;
        }else if (score2 > 8 && count2 < k){
            printf("%d 2\n", i);
            count2++;
        }
        if(count1 == k && count2 == k){
            break;
        }

    }
}
