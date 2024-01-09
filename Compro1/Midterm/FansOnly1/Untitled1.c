#include <stdio.h>

void main(){
    float porn = 0;
    float normal = 0;
    while(1){
        int x;
        scanf("%d", &x);
        if (x == -1){
            break;
        }
        if (x == 4){
            porn++;
        }else {
            normal++;
        }
    }
    //printf("%f %f\n", porn,normal);
    if ((porn / (normal+porn))*100 >= 60){
        for(int i = 1; i<=porn; i++){
            printf("Alert!! Porn contents\n");
        }
        printf("The user was banned");
    } else {
        for(int i = 1; i<=porn; i++){
            printf("Alert!! Porn contents\n");
        }
    }
}
