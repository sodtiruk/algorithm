#include <stdio.h>

void main(){
    int target ,consec = 1, maxconsec = -2000000000;
    scanf("%d", &target);
    int maxconsectarget;
    while (1){
        int x;
        scanf("%d", &x);

        //printf("t %d x %d\n", target, x);

        if (x == 0){
            break;
        }

        if (x == target){
            consec++;
        } else {
            consec = 1;
        }
        if (consec > maxconsec){
            maxconsec = consec;
            maxconsectarget = target;
        }

        //printf("x %d consec %d maxtarget %d maxconsec %d\n", x, consec, maxconsectarget, maxconsec);
        target = x;
    }
    printf("%d\n%d", maxconsec, maxconsectarget);
}
