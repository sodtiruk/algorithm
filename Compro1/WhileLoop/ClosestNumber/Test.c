#include <stdio.h>

void main(){
    int x, N;
    int Nclose;
    int distance = 2000000;
    int i = 1;

    scanf("%d", &x);
    while (i <= 8){
        scanf("%d", &N);

        int diff_distance = x-N;
        if (diff_distance < 0){ // เปลี่ยนเลขเป็นจำนวนเต็มบวก
            diff_distance = 0-diff_distance;
        }
        if (diff_distance < distance){ //เก็บค่า
            distance = diff_distance;
            Nclose = N;
        }
        i++;
    }
    printf("%d", Nclose);
}
