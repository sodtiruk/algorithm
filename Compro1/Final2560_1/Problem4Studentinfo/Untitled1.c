#include<stdio.h>
struct {
    int id;
    char name[52];
    int score[5];
} typedef STUDENT;
STUDENT students[100];

void showAllScores(int nStudent){
    printf("Scores\n");
    for (int i=0; i<nStudent; i++){
        printf("%d %s %d %d %d %d %d\n", students[i].id, students[i].name, students[i].score[0], students[i].score[1]
               , students[i].score[2], students[i].score[3], students[i].score[4]);
    }
}
void showAllGrades(int nStudent){
    printf("Grades\n");
    for (int i=0; i<nStudent; i++){
        printf("%d %s", students[i].id, students[i].name);
        for (int j=0; j<5; j++){
            int s = students[i].score[j];
            if (s >= 80){
                printf(" A");
            } else if (s >= 70){
                printf(" B");
            } else if (s >= 60){
                printf(" C");
            } else if (s >= 50){
                printf(" D");
            } else {
                printf(" F");
            }
        }
        printf("\n");
    }
}
void showStudentScores(int nStudent){
    int id;
    scanf("%d", &id);
    for (int i=0; i<nStudent; i++){
        if (students[i].id == id){
            printf("%d %s %d %d %d %d %d\n", students[i].id, students[i].name, students[i].score[0], students[i].score[1]
                ,students[i].score[2], students[i].score[3], students[i].score[4]);
        }
    }
}
void showStudentGrade(int nStudent, int id){
    for (int i=0; i<nStudent; i++){
        if (students[i].id == id){
            printf("%d %s", students[i].id, students[i].name);
            for (int j=0; j<5; j++){
                int s = students[i].score[j];
                if (s >= 80){
                    printf(" A");
                } else if (s >= 70){
                    printf(" B");
                } else if (s >= 60){
                    printf(" C");
                } else if (s >= 50){
                    printf(" D");
                } else {
                    printf(" F");
                }
            }
            printf("\n");
        }
    }
}
void changeName(int nStudent){
    int id;
    scanf("%d", &id);
    for (int i=0; i<nStudent; i++){
        if (students[i].id == id){
            scanf("%s", students[i].name);
        }
    }
}
void changeScore(int nStudent){
    int id, subject, score;
    scanf("%d%d%d", &id, &subject, &score);
    for(int i=0; i<nStudent; i++){
        if (students[i].id == id){
            students[i].score[subject-1] = score;
        }
    }
}


void main(){
    int command;
    // 4.1
    int nStudent = 0;
    while(1){
        int id;
        scanf("%d", &id);
        if (id == 0){
            break;
        }
        students[nStudent].id = id;
        scanf("%s %d %d %d %d %d", students[nStudent].name, &students[nStudent].score[0], &students[nStudent].score[1]
              , &students[nStudent].score[2], &students[nStudent].score[3], &students[nStudent].score[4]);
        nStudent++;
    }
    printf("Number of Students %d\n", nStudent);
    showAllScores(nStudent);
    // 4.2
    showAllGrades(nStudent);


    while(1){
        scanf("%d", &command);
        if(command == 0){
            break;
        }else if(command == 1){
            showAllScores(nStudent);
        }else if(command == 2){
            showAllGrades(nStudent);
        }else if(command == 3){
            showStudentScores(nStudent);
        }else if(command == 4){
            int id;
            scanf("%d", &id);
            showStudentGrade(nStudent, id);
        }else if(command == 5){
            changeName(nStudent);
        }else if(command == 6){
            changeScore(nStudent);
        }else{
            printf("please input 1,2,3,4,5,6,or 0\n");
        }
    }
}

