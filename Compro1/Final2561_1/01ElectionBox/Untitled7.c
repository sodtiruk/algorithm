#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int space = 0;
    int spaceinloop = n-4;
    int spaceonright = 0;

    //upper
    for(int i=0; i<n; i++){
        printf("*");
    }
    printf("\n");

    //body
    for(int i=0; i<(n-2)/2; i++){
        printf("*");
        for(int i=0; i<space; i++){
            printf(" ");
        }
        printf("*");
        for(int i=0; i<spaceinloop; i++){
            printf(" ");
        }
        printf("*");
        for(int i=0; i<spaceonright; i++){
            printf(" ");
        }
        printf("*");
        space++;
        spaceinloop -= 2;
        spaceonright++;
        printf("\n");
    }

    //middle 2
    printf("*");
    for(int i=0; i<(n-2)/2; i++){
        printf(" ");
    }
    printf("*");
    for(int i=0; i<(n-2)/2; i++){
        printf(" ");
    }
    printf("*");
    printf("\n");

    //Body 2
    int spacedownleft = ((n-2)/2)-1;
    int spacemiddledown = 1;
    int spacedownright = ((n-2)/2)-1;
    for(int i=0; i<(n-2)/2; i++){
        printf("*");
        for(int i=0; i<spacedownleft; i++){
            printf(" ");
        }
        printf("*");
        for(int i=0; i<spacemiddledown; i++){
            printf(" ");
        }
        printf("*");
        for(int i=0; i<spacedownright; i++){
            printf(" ");
        }
        printf("*");
        spacedownleft--;
        spacemiddledown += 2;
        spacedownright--;
        printf("\n");
    }

    //Lower
    for(int i=0; i<n; i++){
        printf("*");
    }
}
