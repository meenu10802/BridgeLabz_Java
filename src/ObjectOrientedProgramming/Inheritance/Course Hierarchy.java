package ObjectOrientedProgramming.Inheritance;

/*
 * Problem Statement:
 * Write a Java program to demonstrate multilevel inheritance
 * using Course, OnlineCourse, and PaidOnlineCourse classes.
 */

/*
 * Class Name: Course
 *
 * Description:
 * This superclass represents a generic course.
 * It stores common attributes such as course name
 * and duration that are shared by all courses.
 */
class Course {

    // Name of the course
    String courseName;

    // Duration of the course (in hours/days)
    int duration;

    // Constructor to initialize course details
    Course(String courseName, int duration) {

        // Assign course name
        this.courseName = courseName;

        // Assign course duration
        this.duration = duration;
    }
}

/*
 * Class Name: OnlineCourse
 *
 * Description:
 * This class represents an online course.
 * It extends the Course class and adds
 * online-specific attributes.
 */
class OnlineCourse extends Course {

    // Platform on which the course is hosted
    String platform;

    // Indicates whether the course is recorded
    boolean isRecorded;

    // Constructor to initialize online course details
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {

        // Call superclass constructor
        super(courseName, duration);

        // Assign platform name
        this.platform = platform;

        // Assign recording status
        this.isRecorded = isRecorded;
    }
}

/*
 * Class Name: PaidOnlineCourse
 *
 * Description:
 * This class represents a paid online course.
 * It extends the OnlineCourse class, demonstrating
 * multilevel inheritance.
 */
class PaidOnlineCourse extends OnlineCourse {

    // Course fee
    double fee;

    // Discount applicable on the fee
    double discount;

    // Constructor to initialize paid online course details
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {

        // Call superclass constructor
        super(courseName, duration, platform, isRecorded);

        // Assign course fee
        this.fee = fee;

        // Assign discount amount
        this.discount = discount;
    }
}
