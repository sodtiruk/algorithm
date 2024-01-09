#include <stdio.h>

void main(){
    int n;
    scanf("%d", &n);
    int check = 0;
    char name[n+1];
    scanf("%s", &name);
    for(int i=0; i<n; i++){
        if (name[i] == 'M' && name[i+1] == 'F'){
            name[i] = 'F';
            name[i+1] = 'M';
        }
        printf("%s\n", name);
    }


}
