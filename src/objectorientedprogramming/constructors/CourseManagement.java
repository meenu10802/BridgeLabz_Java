package ObjectOrientedProgramming.Constructors.Level1;

/*
 * CourseManagement class
 * ----------------------
 * Demonstrates class variables shared across objects.
 */
public class CourseManagement {

    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " | " + fee + " | " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}
