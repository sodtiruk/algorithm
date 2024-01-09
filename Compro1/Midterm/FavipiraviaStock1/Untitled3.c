#include <stdio.h>

void main(){
    int stoct_ya, stock_fah, w, o;
    float t;
    scanf("%d %d %d %f %d", &stoct_ya, &stock_fah, &w, &t,&o);
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
    int stockleft = stoct_ya - ya;
    int stockfaleft = stock_fah - cap;
    printf("%d %d\n%d %d", ya, cap,stockleft,stockfaleft);
}
