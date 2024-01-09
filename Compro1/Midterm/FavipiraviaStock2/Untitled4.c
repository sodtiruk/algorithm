#include <stdio.h>

void main(){
    int stock_ya, capfah_stock;
    scanf("%d %d", &stock_ya, &capfah_stock);
    int N;
    scanf("%d", &N);
    int i = 1;
    while (i <= N){
        int w,o;
        float t;
        scanf("%d %f %d", &w, &t, &o);
        int ya;
        if (t >= 37.5 && o < 90){
            ya = w * 3;
        }else if (t >= 37.5 && o >= 90){
            ya = w * 2;
        }else if (t < 37.5 && o < 90){
            ya = w * 2;
        }else {
            ya = 0;
        }
        int cap = ya * 4 + 120;
        if (stock_ya - ya >= 0 && capfah_stock - cap >= 0){
            stock_ya -= ya;
            capfah_stock -= cap;
            printf("OK\n");
        }else if (stock_ya - ya < 0 && capfah_stock - cap >= 0){
            capfah_stock -= cap;
            printf("No Favipiravir\n");
        }else if (stock_ya - ya >= 0 && capfah_stock - cap < 0){
            stock_ya -= ya;
            printf("No capsule\n");
        }else if (stock_ya - ya < 0 && capfah_stock - cap < 0){
            printf("Not enough both\n");
        }
        i++;
    }
    printf("%d %d", stock_ya, capfah_stock);

}
