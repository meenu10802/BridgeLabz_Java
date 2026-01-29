package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Abstract base class representing a course evaluation type.
 * All specific course types must extend this class.
 */
abstract class CourseType {

    protected String evaluationMethod;

    // Returns evaluation details
    public abstract String getEvaluationDetails();
}

/*
 * Represents exam-based courses.
 */
class ExamCourse extends CourseType {

    public ExamCourse() {
        this.evaluationMethod = "Written Exams";
    }

    // Returns exam evaluation details
    public String getEvaluationDetails() {
        return evaluationMethod;
    }
}

/*
 * Represents assignment-based courses.
 */
class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        this.evaluationMethod = "Assignments & Projects";
    }

    // Returns assignment evaluation details
    public String getEvaluationDetails() {
        return evaluationMethod;
    }
}

/*
 * Represents research-based courses.
 */
class ResearchCourse extends CourseType {

    public ResearchCourse() {
        this.evaluationMethod = "Research & Thesis";
    }

    // Returns research evaluation details
    public String getEvaluationDetails() {
        return evaluationMethod;
    }
}

/*
 * Generic Course class that manages different course types.
 * Uses bounded type parameters to restrict course evaluation types.
 */
class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    // Constructor to initialize course
    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    // Displays course details
    public void displayCourse() {
        System.out.println("Course: " + courseName + ", Evaluation: " + courseType.getEvaluationDetails());
    }
}

/*
 * Utility class to handle courses dynamically using wildcards.
 */
class CourseUtils {

    // Displays any type of course using upper bounded wildcard
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Evaluation Type: " + course.getEvaluationDetails());
        }
    }
}

/*
 * Main class to demonstrate the university course management system.
 */
public class UniversityCourseManagement {

    public static void main(String[] args) {

        Course<ExamCourse> math =
                new Course<>("Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs =
                new Course<>("Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd =
                new Course<>("PhD Research", new ResearchCourse());

        math.displayCourse();
        cs.displayCourse();
        phd.displayCourse();

        List<CourseType> evaluations = new ArrayList<>();
        evaluations.add(new ExamCourse());
        evaluations.add(new AssignmentCourse());
        evaluations.add(new ResearchCourse());

        System.out.println("\nAll Evaluation Types:");
        CourseUtils.displayAllCourses(evaluations);
    }
}
