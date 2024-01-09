#include <stdio.h>

void main(){
    int x, y, z;
    scanf("%d%d%d", &x, &y, &z);
    if (x <= y && y <= z){
        if (x <= z){
            printf("%d %d %d",x, y, z);
        }
    }else if (x <= y && y >= z){
        if (x <= z){
            printf("%d %d %d", x, z, y);
        } else {
            printf("%d %d %d", z, x, y);
        }
    }else if (x >= y && y <= z){
        if (x <= z){
            printf("%d %d %d", y, x, z);
        }else {
            printf("%d %d %d", y, z, x);
        }
    }else if (x >= y && y >= z){
        printf("%d %d %d", z, y, x);
    }
}

