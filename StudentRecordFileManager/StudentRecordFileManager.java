package StudentRecordFileManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Assignment 9: Student Record File Manager
 * Unit 5 – File Handling in Java
 * 
 * Demonstrates:
 * - File class: mkdir(), exists(), createNewFile(), getName(), getPath(),
 *   getAbsolutePath(), length(), isFile(), isDirectory(), delete()
 * - FileOutputStream: writing byte data with getBytes(), append mode (two-argument constructor)
 * - FileInputStream: reading byte-by-byte with read() and converting to char
 * - Exception Handling: try-catch blocks handling IOExceptions and displaying informative messages
 */
public class StudentRecordFileManager {

    private static final String DIR_NAME = "StudentRecords";
    private static final String FILE_NAME = "student.txt";

    private static final File directory = new File(DIR_NAME);
    private static final File recordFile = new File(directory, FILE_NAME);

    // =========================================================================
    // 1. Create Records Directory
    // =========================================================================
    public static void createDirectory() {
        try {
            if (directory.exists()) {
                System.out.println("Directory already exists: " + directory.getName());
            } else {
                boolean created = directory.mkdir();
                if (created) {
                    System.out.println("Directory created: " + directory.getName());
                } else {
                    System.out.println("Failed to create directory: " + directory.getName());
                }
            }
        } catch (SecurityException e) {
            System.out.println("Permission denied: Unable to create directory. " + e.getMessage());
        }
    }

    // =========================================================================
    // 2. Create Record File
    // =========================================================================
    public static void createRecordFile() {
        try {
            // Ensure parent directory exists first
            if (!directory.exists()) {
                directory.mkdir();
            }

            if (recordFile.exists()) {
                System.out.println("File already exists: " + recordFile.getPath());
            } else {
                boolean created = recordFile.createNewFile();
                if (created) {
                    System.out.println("File created: " + recordFile.getPath());
                } else {
                    System.out.println("Failed to create file: " + recordFile.getPath());
                }
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Permission denied: Unable to create file. " + e.getMessage());
        }
    }

    // =========================================================================
    // 3. Write Student Record (Overwrites existing data)
    // =========================================================================
    public static void writeStudentRecord(Scanner scanner) {
        // Ensure directory and file exist
        if (!directory.exists()) {
            directory.mkdir();
        }

        System.out.print("Enter Student Record (e.g., Roll No 101, Rahul Sharma, B.Tech CE): ");
        String record = scanner.nextLine().trim();

        if (record.isEmpty()) {
            System.out.println("Record cannot be empty!");
            return;
        }

        // Use FileOutputStream to write string converted to bytes
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(recordFile); // Default: overwrite mode
            byte[] bytes = (record + System.lineSeparator()).getBytes();
            fos.write(bytes);
            System.out.println("Record written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing record: " + e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Error closing file output stream: " + e.getMessage());
                }
            }
        }
    }

    // =========================================================================
    // 4. Display File Information
    // =========================================================================
    public static void displayFileInfo() {
        if (!recordFile.exists()) {
            System.out.println("File does not exist: " + recordFile.getPath());
            System.out.println("Please create the file or write a record first.");
            return;
        }

        System.out.println("===== File Information =====");
        System.out.println("Name          : " + recordFile.getName());
        System.out.println("Path          : " + recordFile.getPath());
        System.out.println("Absolute Path : " + recordFile.getAbsolutePath());
        System.out.println("Size          : " + recordFile.length() + " bytes");
        System.out.println("Is File       : " + recordFile.isFile());
        System.out.println("Is Directory  : " + recordFile.isDirectory());
    }

    // =========================================================================
    // 5. Read File Content
    // =========================================================================
    public static void readFileContent() {
        if (!recordFile.exists()) {
            System.out.println("File not found: " + recordFile.getPath());
            System.out.println("Please write or append a record first.");
            return;
        }

        if (recordFile.length() == 0) {
            System.out.println("File is empty.");
            return;
        }

        System.out.println("===== File Content =====");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(recordFile);
            int byteRead;
            // Read byte by byte and convert to character until EOF (-1)
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing file input stream: " + e.getMessage());
                }
            }
        }
    }

    // =========================================================================
    // 6. Append New Record (Preserves existing data)
    // =========================================================================
    public static void appendStudentRecord(Scanner scanner) {
        // Ensure directory exists
        if (!directory.exists()) {
            directory.mkdir();
        }

        System.out.print("Enter Student Record to Append: ");
        String record = scanner.nextLine().trim();

        if (record.isEmpty()) {
            System.out.println("Record cannot be empty!");
            return;
        }

        // Use two-argument FileOutputStream constructor with append=true
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(recordFile, true); // Append mode: true
            byte[] bytes = (record + System.lineSeparator()).getBytes();
            fos.write(bytes);
            System.out.println("Record appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending record: " + e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Error closing file output stream: " + e.getMessage());
                }
            }
        }
    }

    // =========================================================================
    // 7. Delete Record File
    // =========================================================================
    public static void deleteRecordFile() {
        if (!recordFile.exists()) {
            System.out.println("File does not exist: " + recordFile.getPath());
            return;
        }

        try {
            boolean deleted = recordFile.delete();
            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file: " + recordFile.getPath());
            }
        } catch (SecurityException e) {
            System.out.println("Permission denied: Unable to delete file. " + e.getMessage());
        }
    }

    // =========================================================================
    // Main Method: Menu Loop and Routing
    // =========================================================================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 8) {
            System.out.println("\n===== Student Record File Manager =====");
            System.out.println("1. Create Records Directory");
            System.out.println("2. Create Record File");
            System.out.println("3. Write Student Record");
            System.out.println("4. Display File Information");
            System.out.println("5. Read File Content");
            System.out.println("6. Append New Record");
            System.out.println("7. Delete Record File");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            String input = scanner.nextLine().trim();
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please enter a number between 1 and 8.");
                continue;
            }

            switch (choice) {
                case 1:
                    createDirectory();
                    break;
                case 2:
                    createRecordFile();
                    break;
                case 3:
                    writeStudentRecord(scanner);
                    break;
                case 4:
                    displayFileInfo();
                    break;
                case 5:
                    readFileContent();
                    break;
                case 6:
                    appendStudentRecord(scanner);
                    break;
                case 7:
                    deleteRecordFile();
                    break;
                case 8:
                    System.out.println("Exiting Student Record File Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option (1-8).");
                    break;
            }
        }

        scanner.close();
    }
}
