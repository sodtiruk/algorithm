#include <stdio.h>

void main(){
    float min = 2000000000.00;
    int n;
    scanf("%d", &n);
    int want;
    scanf("%d", &want);

    int c;
    for(int j=0; j<n; j++){
        int x1;
        float x2;
        scanf("%d %f", &x1, &x2);
        int ax = (want+x1-1)/x1;
        float a = ax*x2;
        if (a < min){
            min = a;
            c = j+1;
        }
    }
    printf("%d : %.2f", c, min);

}


