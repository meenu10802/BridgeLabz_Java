package ObjectOrientedProgramming.Inheritance;

/*
 * CourseBase class
 * ----------------
 * Superclass representing a general course.
 * Contains common course attributes like name and duration.
 */
class CourseBase {
    String courseName;  // Name of the course
    int duration;  // Duration in weeks

    // Constructor to initialize course
    CourseBase(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

/*
 * OnlineCourseDetails class
 * -------------------------
 * Subclass extending CourseBase with online-specific features.
 * Demonstrates single-level inheritance.
 */
class OnlineCourseDetails extends CourseBase {
    String platform;  // Platform for the online course
    boolean isRecorded;  // Whether course is recorded

    // Constructor to initialize online course
    OnlineCourseDetails(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overridden method to include online-specific details
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

/*
 * PaidOnlineCourseDetails class
 * -----------------------------
 * Subclass extending OnlineCourseDetails.
 * Demonstrates multilevel (three-level) inheritance.
 */
class PaidOnlineCourseDetails extends OnlineCourseDetails {
    double fee;  // Course fee
    double discount;  // Discount percentage

    // Constructor to initialize paid online course
    PaidOnlineCourseDetails(String name, int duration, String platform,
                            boolean recorded, double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method to include fee and discount information
    @Override
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        // Creating a paid online course object
        PaidOnlineCourseDetails course =
                new PaidOnlineCourseDetails("Java OOP", 8, "Udemy", true, 3000, 20);

        // Displaying course details (demonstrates multilevel inheritance)
        course.displayCourseDetails();
    }
}
