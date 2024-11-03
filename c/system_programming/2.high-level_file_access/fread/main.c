#include <stdio.h>
#include <stdlib.h>

int main() {
    // Open the file for reading in binary mode
    FILE *fp = fopen("text.txt", "r");
    if (fp == NULL) {
        perror("Failed to open file");
        exit(EXIT_FAILURE);
    }

    // Buffer to store the read integers
    char buffer[10]; // Array to hold up to 10 int values
    size_t elementsRead;

    // Read up to 10 int values from the file
    elementsRead = fread(buffer, sizeof(char), 10, fp);

    if (elementsRead > 0) {
        // Print the integers read from the file
        printf("Read %zu integers from the file:\n", elementsRead);
        for (size_t i = 0; i < elementsRead; i++) {
            printf("%c\n", buffer[i]);
        }
    } else if (feof(fp)) {
        printf("End of file reached.\n");
    } else if (ferror(fp)) {
        perror("Error reading from file");
    }

    // Close the file
    fclose(fp);
    return 0;
}
