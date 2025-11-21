# vityarthi_-Exam-Date-and-Subject-Lookup-by-Registration-Number
This project retrieves exam dates and subject names by entering a student's registration number. It links student branch and subjects to display personalized exam schedules clearly and quickly, improving access to exam information and aiding student preparation
Project Title
Exam Schedule Lookup System

Overview
This project retrieves exam dates and subject names by entering a student's registration number prefix associated with their academic branch. It links the student’s branch to relevant subjects and displays personalized exam schedules clearly and quickly. This improves access to exam information and aids in student preparation.

Features
Retrieve personalized exam schedules based on branch prefix input.

Display subjects along with exam dates and timings.

Support for multiple branches with branch-specific subjects.

Simple console input/output interface for ease of use.

Case-insensitive branch prefix matching.

Technologies Used
Java programming language

Java Collections Framework (HashMap)

Console-based user input with Scanner

Installation and Running Instructions
Ensure you have Java Development Kit (JDK) installed (version 8 or above recommended).

Clone or download the project repository from GitHub.

Navigate to the project directory.

Compile the Java program:

text
javac ExamScheduleLookup.java
Run the compiled program:

text
java ExamScheduleLookup
Enter the branch prefix when prompted (e.g., 24BME, 24BCE, 24BAS) to retrieve exam schedules.

Testing Information
Manual tests can be performed by entering branch prefixes and verifying the printed exam subjects, dates, and timings match expected branch schedules.

Test inputs:

24BME (should display Mechanical Engineering subjects)

24BCE (should display Computer Science subjects)

24BAS (should display Aerospace Engineering subjects)

Confirm the program handles invalid prefixes gracefully with an appropriate message.

