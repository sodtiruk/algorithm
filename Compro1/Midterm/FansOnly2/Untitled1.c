#include <stdio.h>

void main(){
    float porn = 0;
    float consecporn = 0;
    float normal = 0;
    float maxconsecporn = 0;
    while(1){
        int x;
        scanf("%d", &x);
        if (x == -1){
            break;
        }
        if (x == 4){
            porn++;
            consecporn++;
        }else {
            consecporn = 0;
            normal++;
        }
        if (consecporn >= maxconsecporn){
            maxconsecporn = consecporn;
        }
    }
    //printf("%f %f %f", porn, consecporn, maxconsecporn);
    if ((porn / (normal+porn))*100 >= 60 && maxconsecporn >= 3){
        printf("The user was banned");
    }else if ((porn / (normal+porn))*100 >= 60 || maxconsecporn >= 3){
        printf("The user was warned");
    }else {
        printf("Pass");
    }
}
