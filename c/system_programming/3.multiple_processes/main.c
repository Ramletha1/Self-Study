#include <stdio.h>
#include <unistd.h>

void main() {
    pid_t pid = fork();

    if (pid==0) printf("Child Process");
    else if (pid>1) printf("Parent Process");

    return;
}