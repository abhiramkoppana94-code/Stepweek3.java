import java.util.Scanner;

class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }
}

public class CourseDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String theoryCode = scanner.nextLine();
        String[] theoryData = theoryCode.split(",");

        String code1 = theoryData[0].trim();
        String title1 = theoryData[1].trim();
        int credits1 = Integer.parseInt(theoryData[2].trim());

        Course theoryCourse = new Course(code1, title1, credits1);

        String labCode = scanner.nextLine();
        String[] labData = labCode.split(",");

        String code2 = labData[0].trim();
        String title2 = labData[1].trim();
        int credits2 = Integer.parseInt(labData[2].trim());
        int labCredits2 = Integer.parseInt(labData[3].trim());

        Course labCourse = new Course(code2, title2, credits2, labCredits2);

        System.out.println(code1 + " total credits: " + theoryCourse.totalCredits());
        System.out.println(code2 + " total credits: " + labCourse.totalCredits());

        scanner.close();
    }
}