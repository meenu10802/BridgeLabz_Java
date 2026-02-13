package collectionsandstreams.junit;

/**
 * Basic JUnit Test - Problem 7: Performance Testing Using @Timeout
 *
 * This class contains a longRunningTask method that sleeps for 3 seconds
 * before returning. Used to demonstrate JUnit's @Timeout annotation to fail
 * tests that exceed a specified time limit (e.g., 2 seconds).
 */
public class LongRunningTask {

    // Sleeps for 3 seconds then returns a result (designed to exceed 2-second timeout)
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
        return "Task completed";
    }
}
