package junittest.basicjunittest.timeouttesting;

import junit.basicjunittest.timeouttesting.TaskUtils;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TaskUtilsTest {

    private TaskUtils taskUtils;

    @BeforeEach
    void setup() {
        taskUtils = new TaskUtils();
    }

    @Test
    @Timeout(2)  // Fail the test if it takes more than 2 seconds
    void testLongRunningTaskWithTimeout() throws InterruptedException {
        String result = taskUtils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
