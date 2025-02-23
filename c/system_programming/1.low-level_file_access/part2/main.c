#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <fcntl.h> 
#include <sys/types.h> 
#include <sys/stat.h>

#define BUFFER_SIZE 256

void main() {
    int fp;
    char pathName[100], inputTxt[256];
    char buffer[BUFFER_SIZE];
    ssize_t B_read, B_write;

    printf("Input path: ");
    scanf("%s", pathName);
    /*if ((fp = open(pathName, O_RDWR | O_CREAT | O_APPEND)) == -1) {
        printf("Error");
        exit(EXIT_FAILURE);
    }*/
    fp = open(pathName, O_RDWR | O_CREAT | O_APPEND, 0644);

    printf("Input text: ");
    scanf("%s[^\n]", inputTxt);

    B_write = write(fp, inputTxt, strlen(inputTxt));

    close(fp);
}