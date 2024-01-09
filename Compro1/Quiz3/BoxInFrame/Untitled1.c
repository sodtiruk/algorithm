#include <stdio.h>
// ******* //UPPER
// *OOOOO* //UPPER
// *O***O*
// *O***O* //BODY               input7
// *O***O*
// *OOOOO* //LOWER
// ******* //LOWER

void main(){
    int n;
    scanf("%d", &n);
    //Upper
    for (int i=0; i<n; i++){
        printf("*");
    }
    printf("\n*");
    for (int i=1; i<n-1; i++){
        printf(" ");
    }
    printf("*\n");
    //Body
    for(int i=2; i<n-2; i++){
        printf("* ");
        for (int i=2; i<n-2; i++){
            printf("*");
        }
        printf(" *\n");
    }
    //Lower
    printf("*");
    for (int i=1; i<n-1; i++){
        printf(" ");
    }
    printf("*\n");
    for (int i=0; i<n; i++){
        printf("*");
    }
}
