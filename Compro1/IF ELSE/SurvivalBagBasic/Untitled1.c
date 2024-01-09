#include <stdio.h>

void main(){
    int x,y,z;
    int x1,y1,z1;
    int xr,yr,zr;
    int result;
    scanf("%d%d%d", &x,&y,&z);
    x1 = x/3;
    y1 = y/4;
    z1 = z/2;
    if (x1 <= y1 && x1 <= z1){
        result = x1;
    }else if (y1 <= x1 && y1 <= z1){
        result = y1;
    }else if (z1 <= x1 && z1 <= y1){
        result = z1;
    }
    xr = x - (result * 3);
    yr = y - (result * 4);
    zr = z - (result * 2);
    printf("%d %d %d %d", result, xr, yr, zr);

}
