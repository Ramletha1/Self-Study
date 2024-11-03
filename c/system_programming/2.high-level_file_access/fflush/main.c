#include <stdio.h>
#include <stdlib.h>

int main() {
    // Open a file for writing in text mode
    FILE *fp = fopen("example.txt", "w");
    if (fp == NULL) {
        perror("Failed to open file");
        exit(EXIT_FAILURE);
    }

    // Write data to the file buffer (not immediately written to disk)
    fprintf(fp, "This is an example using fflush().\n");

    // Flush the output buffer to ensure the data is written to the file
    if (fflush(fp) != 0) {
        perror("Failed to flush file buffer");
        fclose(fp);
        exit(EXIT_FAILURE);
    }

    printf("Data flushed to the file successfully.\n");

    // Close the file
    if (fclose(fp) != 0) {
        perror("Failed to close file");
        exit(EXIT_FAILURE);
    }

    return 0;
}
