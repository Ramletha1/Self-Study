#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

#define TIME 10

void main() {
    pid_t pid = fork();

    if (pid==0) {           // Child process
        printf("Child Process: %d\n", pid);
        sleep(TIME+1);
        printf("\nEnd of Child\n");
        exit(0);
    }

    else if (pid>1) {       // Parent process
        printf("Parent Process: %d\n", pid);
        sleep(1);
        int i;
        while (waitpid(pid, NULL, WNOHANG) == 0) {  // Loop until child process exit
            printf("%d ", ++i);
            fflush(stdout);         // Force print
            // if (i%2==0) fflush(stdout);      // Print every 2 loop
            sleep(1);
        }
        printf("End of Parent\n");
    }

    return;
}