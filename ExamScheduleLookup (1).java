import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamScheduleLookup {

    // Maps branch prefix to exam schedule: subject -> {date, timing}
    private static Map<String, Map<String, String[]>> branchExamSchedule = new HashMap<>();

    static {
        // Mechanical Engineering subjects and schedule
        Map<String, String[]> bmeSchedule = new HashMap<>();
        bmeSchedule.put("Thermodynamics", new String[]{"2025-12-02", "10:00 AM - 01:00 PM"});
        bmeSchedule.put("Fluid Mechanics", new String[]{"2025-12-06", "02:00 PM - 05:00 PM"});
        branchExamSchedule.put("24BME", bmeSchedule);

        // Computer Science Engineering subjects and schedule
        Map<String, String[]> bceSchedule = new HashMap<>();
        bceSchedule.put("Data Structures", new String[]{"2025-12-01", "09:00 AM - 12:00 PM"});
        bceSchedule.put("Operating Systems", new String[]{"2025-12-05", "01:00 PM - 04:00 PM"});
        branchExamSchedule.put("24BCE", bceSchedule);

        // Aerospace Engineering subjects and schedule
        Map<String, String[]> basSchedule = new HashMap<>();
        basSchedule.put("Aerodynamics", new String[]{"2025-12-03", "09:30 AM - 12:30 PM"});
        basSchedule.put("Propulsion Systems", new String[]{"2025-12-07", "01:30 PM - 04:30 PM"});
        branchExamSchedule.put("24BAS", basSchedule);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter branch prefix (e.g., 24BME, 24BCE, 24BAS): ");
        String branchPrefix = scanner.nextLine().trim().toUpperCase();

        Map<String, String[]> schedule = branchExamSchedule.get(branchPrefix);
        if (schedule == null) {
            System.out.println("No exam schedule found for branch prefix: " + branchPrefix);
        } else {
            System.out.println("Exam schedule for branch prefix: " + branchPrefix);
            schedule.forEach((subject, dateTime) -> 
                System.out.println(subject + " : Date - " + dateTime[0] + ", Time - " + dateTime[1]));
        }
        scanner.close();
    }
}
