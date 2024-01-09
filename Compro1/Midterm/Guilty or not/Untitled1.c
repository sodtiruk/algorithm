#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int pid = 0;
    int maipid = 0;
    int i = 1;
    while(i <= n){
            int d1,d2;
            scanf("%d %d", &d1,&d2);
            if (d1 == 1 && d2 == 0){
                pid++;
            }else if (d1 == 0 && d2 == 1){
                maipid++;
            }else if (d1 == 0 && d2 == 0){
                maipid++;
            }else if (d1 == 1 && d2 == 1){
                maipid++;
            }
            int d3,d4;
            scanf("%d %d", &d3, &d4);
            if (d3 == 1 && d4 == 0){
                pid++;
            }else if (d3 == 0 && d4 == 1){
                maipid++;
            }else if (d3 == 0 && d4 == 0){
                maipid++;
            }else if (d3 == 1 && d4 == 1){
                maipid++;
            }
            int d5,d6;
            scanf("%d %d", &d5, &d6);
            if (d5 == 1 && d6 == 0){
                pid++;
            }else if (d5 == 0 && d6 == 1){
                maipid++;
            }else if (d5 == 0 && d6 == 0){
                maipid++;
            }else if (d5 == 1 && d6 == 1){
                maipid++;
            }
            int d7,d8;
            scanf("%d %d", &d7, &d8);
            if (d7 == 1 && d8 == 0){
                pid++;
            }else if (d7 == 0 && d8 == 1){
                maipid++;
            }else if (d7 == 0 && d8 == 0){
                maipid++;
            }else if (d7 == 1 && d8 == 1){
                maipid++;
            }
            int d9,d10;
            scanf("%d %d", &d9, &d10);
            if (d9 == 1 && d10 == 0){
                pid++;
            }else if (d9 == 0 && d10 == 1){
                maipid++;
            }else if (d9 == 0 && d10 == 0){
                maipid++;
            }else if (d9 == 1 && d10 == 1){
                maipid++;
            }
            if (pid > maipid){
                printf("Case#%d was guilty\n",i);
            }else if(pid < maipid){
                printf("Case#%d was not guilty\n",i);
            }else if (pid == maipid){
                printf("Case#%d was guilty\n",i);
            }
            pid = 0;
            maipid = 0;
            i++;
    }
}
