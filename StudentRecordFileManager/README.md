# Assignment 9: Student Record File Manager

## 📌 Overview
The **Student Record File Manager** is a console-based Java application built to demonstrate **Unit 5 – File Handling in Java**. It showcases how to work with the `File` class for managing directories and files, use `FileOutputStream` and `FileInputStream` for byte-level data transfer, apply append modes, and handle I/O exceptions robustly.

---

## 🎯 Key Concepts & Methods Implemented

### 1. File Class Operations
- **`mkdir()`**: Creates the `StudentRecords` directory on disk.
- **`exists()`**: Validates if the directory or file exists before performing operations.
- **`createNewFile()`**: Creates the `student.txt` file inside the directory.
- **`getName()`**, **`getPath()`**, **`getAbsolutePath()`**: Retrieves file naming and path metadata.
- **`length()`**: Returns the file size in bytes.
- **`isFile()`**, **`isDirectory()`**: Verifies the file system entity type.
- **`delete()`**: Safely deletes the record file when requested.

### 2. FileOutputStream (Write & Append)
- **Overwrite Mode**: `new FileOutputStream(recordFile)` writes student data converted to byte array via `getBytes()`.
- **Append Mode**: `new FileOutputStream(recordFile, true)` appends new student records to the end of the file without overwriting existing entries.

### 3. FileInputStream (Byte-by-Byte Read)
- Reads the file byte by byte using `read()` in a `while ((byteRead = fis.read()) != -1)` loop, converting integer byte values back to characters `(char) byteRead`.

### 4. Robust Exception Handling
- All stream and file operations are enclosed within `try-catch-finally` blocks to handle `IOException`, `FileNotFoundException`, and `SecurityException` gracefully with informative error messages.

---

## 📁 Project Structure

```
StudentRecordFileManager/
├── StudentRecordFileManager.java  # Complete file manager with menu & streams
└── README.md                      # Documentation & instructions
```

---

## 🛠️ How to Compile & Run

From the `NewAssignmnets` workspace root:

```bash
# Compile
javac StudentRecordFileManager/StudentRecordFileManager.java

# Run
java StudentRecordFileManager.StudentRecordFileManager
```

---

## 🖥️ Menu Options

```text
===== Student Record File Manager =====
1. Create Records Directory
2. Create Record File
3. Write Student Record
4. Display File Information
5. Read File Content
6. Append New Record
7. Delete Record File
8. Exit
```

---

## 📋 Sample Execution Flow

```text
===== Student Record File Manager =====
Directory created: StudentRecords
File created: StudentRecords/student.txt
Record written successfully.

===== File Information =====
Name          : student.txt
Path          : StudentRecords/student.txt
Absolute Path : /path/to/StudentRecords/student.txt
Size          : 37 bytes
Is File       : true
Is Directory  : false

===== File Content =====
Roll No 101, Rahul Sharma, B.Tech CE
Record appended successfully.

===== File Content (After Append) =====
Roll No 101, Rahul Sharma, B.Tech CE
Roll No 102, Priya Verma, B.Tech IT

File deleted successfully.
```
