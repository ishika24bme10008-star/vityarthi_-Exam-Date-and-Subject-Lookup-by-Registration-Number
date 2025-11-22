import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class ExamScheduleLookupTest {

    @Test
    public void testValidBranch24BME() {
        Map<String, String[]> schedule = ExamScheduleLookup.getSchedule("24BME");
        assertNotNull(schedule);
        assertTrue(schedule.containsKey("Thermodynamics"));
        assertArrayEquals(new String[]{"2025-12-02", "10:00 AM - 01:00 PM"}, schedule.get("Thermodynamics"));
    }

    @Test
    public void testValidBranch24BCE() {
        Map<String, String[]> schedule = ExamScheduleLookup.getSchedule("24BCE");
        assertNotNull(schedule);
        assertTrue(schedule.containsKey("Data Structures"));
        assertArrayEquals(new String[]{"2025-12-01", "09:00 AM - 12:00 PM"}, schedule.get("Data Structures"));
    }

    @Test
    public void testInvalidBranch() {
        Map<String, String[]> schedule = ExamScheduleLookup.getSchedule("INVALID");
        assertNull(schedule);
    }
}
