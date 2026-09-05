import java.util.Scanner;

class PlacementRecord {

    String studentName;
    String company;
    double packageLpa;

    PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class PlacementRecords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlacementRecord[] records = new PlacementRecord[3];

        for (int i = 0; i < records.length; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(",");

            String studentName = data[0].trim();
            String company = data[1].trim();
            double packageLpa = Double.parseDouble(data[2].trim());

            records[i] = new PlacementRecord(studentName, company, packageLpa);
        }

        for (PlacementRecord record : records) {
            record.printRecord();
        }

        scanner.close();
    }
}