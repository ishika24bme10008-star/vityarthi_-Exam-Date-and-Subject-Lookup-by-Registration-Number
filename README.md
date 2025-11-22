# vityarthi_-Exam-Date-and-Subject-Lookup-by-Registration-Number

*Project Title:
Exam Schedule Lookup System

*Overview:
This project retrieves exam dates and subject names by entering a student's registration number prefix associated with their academic branch. It links the student’s branch to relevant subjects and displays personalized exam schedules clearly and quickly. This improves access to exam information and aids in student preparation.

*Features:

1.Retrieve personalized exam schedules based on branch prefix input.

2.Display subjects along with exam dates and timings.

3.Support for multiple branches with branch-specific subjects.

4.Simple console input/output interface for ease of use.

5.Case-insensitive branch prefix matching.

*Technologies Used:

1.Java programming language

2.Java Collections Framework (HashMap)

3.Console-based user input with Scanner

*Installation and Running Instructions:

1.Ensure you have Java Development Kit (JDK) installed (version 8 or above recommended).

2.Clone or download the project repository from GitHub.

3.Navigate to the project directory.

4.Compile the Java program:

"javac ExamScheduleLookup.java"

5.Run the compiled program:

"java ExamScheduleLookup"

6.Enter the branch prefix when prompted (e.g., 24BME, 24BCE, 24BAS) to retrieve exam schedules.

*Testing Information:

1.Manual tests can be performed by entering branch prefixes and verifying the printed exam subjects, dates, and timings match expected branch schedules.

2.Test inputs:

24BME (should display Mechanical Engineering subjects)

24BCE (should display Computer Science subjects)

24BAS (should display Aerospace Engineering subjects)

*How to Use: To retrieve the exam schedule for a branch prefix programmatically:

Map<String, String[]> schedule = ExamScheduleLookup.getSchedule("24BME");




