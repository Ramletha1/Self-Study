// gcc main.c -o main.
// ./main
// input1 & input2
// output

#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/stat.h>

#define BUFFER_SIZE 256

int main() {
    char input_path[100], output_path[100];
    int input_fd, output_fd;
    char buffer[BUFFER_SIZE];
    ssize_t bytes_read, bytes_written;

    // 1. Get file paths
    printf("Enter input file path: ");
    scanf("%s", input_path);
    printf("Enter output file path: ");
    scanf("%s", output_path);

    // 2. Open input file (read-only)
    input_fd = open(input_path, O_RDONLY);
    if (input_fd == -1) {
        perror("Error opening input file");
        exit(EXIT_FAILURE);
    }

    // 3. Open output file (write-only, create, append)
    output_fd = open(output_path, O_WRONLY | O_CREAT | O_APPEND, 0644);     // Can either be append or trung
    if (output_fd == -1) {
        perror("Error opening output file");
        close(input_fd); // Close already opened input file
        exit(EXIT_FAILURE);
    }

    // 4. Read and write in blocks
    while ((bytes_read = read(input_fd, buffer, BUFFER_SIZE)) > 0) {
        // Write the block to the output file
        bytes_written = write(output_fd, buffer, bytes_read);
        if (bytes_written == -1) {
            perror("Error writing to output file");
            close(input_fd);
            close(output_fd);
            exit(EXIT_FAILURE);
        }
    }
    if (bytes_read == -1) {
        perror("Error reading from input file");
    }

    // 5. Use lseek to skip positions
    // a) Move input file descriptor 512 bytes from the start
    if (lseek(input_fd, 512, SEEK_SET) == -1) {
        perror("Error using lseek on input file");
    }

    // b) Move output file descriptor 128 bytes from the start
    if (lseek(output_fd, 128, SEEK_SET) == -1) {
        perror("Error using lseek on output file");
    }

    // 6. Additional read/write after lseek
    if ((bytes_read = read(input_fd, buffer, BUFFER_SIZE)) > 0) {
        bytes_written = write(output_fd, buffer, bytes_read);
        if (bytes_written == -1) {
            perror("Error in additional write after lseek");
        }
    }

    // 7. Close files
    if (close(input_fd) == -1) {
        perror("Error closing input file");
    }
    if (close(output_fd) == -1) {
        perror("Error closing output file");
    }

    printf("File copy completed successfully.\n");
    return 0;
}