package collectionsandstreams.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for LongRunningTask with @Timeout.
 *
 * Uses @Timeout(2) to fail the test if the method takes more than 2 seconds.
 * The longRunningTask sleeps for 3 seconds, so this test is expected to fail,
 * demonstrating the timeout functionality.
 */
class LongRunningTaskTimeoutTest {

    private final LongRunningTask longRunningTask = new LongRunningTask();

    // Test fails if execution exceeds 2 seconds (method sleeps 3 seconds - will fail)
    @Test
    @DisplayName("Should fail when task exceeds 2 second timeout")
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskExceedsTimeout() throws InterruptedException {
        String result = longRunningTask.longRunningTask();
        assertEquals("Task completed", result);
    }

    // Optional: Test with longer timeout to verify method works correctly
    @Test
    @DisplayName("Should complete successfully with 4 second timeout")
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    void testLongRunningTaskWithinTimeout() throws InterruptedException {
        String result = longRunningTask.longRunningTask();
        assertEquals("Task completed", result);
    }
}
