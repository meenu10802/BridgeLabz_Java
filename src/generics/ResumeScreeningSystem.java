package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Abstract base class representing a job role.
 * All specific job roles must extend this class.
 */
abstract class JobRole {

    protected String roleName;

    // Returns role description
    public abstract String getRoleDescription();
}

/*
 * Represents software engineer role.
 */
class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        this.roleName = "Software Engineer";
    }

    public String getRoleDescription() {
        return roleName;
    }
}

/*
 * Represents data scientist role.
 */
class DataScientist extends JobRole {

    public DataScientist() {
        this.roleName = "Data Scientist";
    }

    public String getRoleDescription() {
        return roleName;
    }
}

/*
 * Represents product manager role.
 */
class ProductManager extends JobRole {

    public ProductManager() {
        this.roleName = "Product Manager";
    }

    public String getRoleDescription() {
        return roleName;
    }
}

/*
 * Generic Resume class that processes resumes based on job role.
 */
class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    // Constructor to initialize resume
    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    // Displays resume details
    public void displayResume() {
        System.out.println(
                "Candidate: " + candidateName +
                        ", Applied Role: " + jobRole.getRoleDescription()
        );
    }
}

/*
 * Utility class for resume screening.
 */
class ResumeScreeningUtils {

    // Screens resumes of any job role using wildcard
    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening for role: " + role.getRoleDescription());
        }
    }
}

/*
 * Main class to demonstrate AI-driven resume screening.
 */
public class ResumeScreeningSystem {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Alice", new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Bob", new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Charlie", new ProductManager());

        r1.displayResume();
        r2.displayResume();
        r3.displayResume();

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        System.out.println("\nScreening Pipeline:");
        ResumeScreeningUtils.screenResumes(roles);
    }
}

