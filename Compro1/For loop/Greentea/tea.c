#include <stdio.h>

void main(){
    int water;
    int sugar;
    int get_water;
    int get_sugar;
    int get_tea;
    int rest_water;

    for(int i = 1; i <= 7; i++){
        scanf("%d %d", &water, &sugar);
        get_water = water / 250;
        get_sugar = sugar / 15;

        if (get_water >= get_sugar){
            get_tea = get_sugar;
        } else {
            get_tea = get_water;
        }

        rest_water = water - (get_tea * 250);

        if (rest_water == 0){
            printf("%d\n", get_tea);
        }else {
            printf("%d water\n", get_tea);
        }
    }
}


