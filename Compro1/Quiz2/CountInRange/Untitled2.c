#include <stdio.h>

void main(){
    int count_xy = 0;
    int thanxy = 0;
    int lessxy = 0;
    int x,y;
    scanf("%d%d", &x, &y);
    if (x < y){
        int i = x;
        while (1){
            int n;
            scanf("%d", &n);
            if (n == 0){
                break;
            }
            if (n > i && n < y){
                count_xy++;
            }else if (n < i && n < y){
                lessxy++;
            }else if (n > i && n > y){
                thanxy++;
            }
        }
        printf("%d\n%d\n%d", count_xy, lessxy, thanxy);
    } else {
        int i = y;
        while (1){
            int n;
            scanf("%d", &n);
            if (n == 0){
                break;
            }
            if (n > i && n < x){
                count_xy++;
            }else if (n < i && n < x){
                lessxy++;
            }else if (n > i && n > x){
                thanxy++;
            }
    }
    printf("%d\n%d\n%d", count_xy, lessxy, thanxy);
    }
}
