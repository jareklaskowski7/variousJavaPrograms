import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonByComparable {
    private StringBuilder statesComparableReport;

    public ComparisonByComparable() {
        statesComparableReport = new StringBuilder();
    }

    public static void main(String[] args) {
        ComparisonByComparable cbComparable = new ComparisonByComparable();
        //File inFile = new File("/home/jarek/Documents/variousJavaPrograms/input.txt");
        //File outFile = new File("/home/jarek/Documents/variousJavaPrograms/statesByComparable.txt");
        File inFile = new File("C:/Prog/codeWin/variousJavaPrograms/input.txt");
        File outFile = new File("C:/Prog/codeWin/variousJavaPrograms/statesByComparable.txt");
        BufferedReader br = null;
        BufferedWriter bw = null;
        List<Person> people = new ArrayList<>();
        try {
            FileReader fr = new FileReader(inFile);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] peopleAttributes = line.split(",");
                Person person = new Person();
                person.setFirstName(peopleAttributes[1]);
                person.setLastName(peopleAttributes[2]);
                person.setState(peopleAttributes[3]);
                people.add(person);
                Collections.sort(people);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inFile.toString());
        } catch (IOException e) {
            System.out.println("Unable to read a file: " + inFile.toString());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Unable to close a file: " + inFile.toString());
            } catch (NullPointerException ex) {
                ex.printStackTrace();
            }
        }
        try {
            FileWriter fw = new FileWriter(outFile);
            bw = new BufferedWriter(fw);
            int countPeople = 0;
            for (Person person : people) {
                countPeople++;
                person.setId(countPeople);
                cbComparable.statesComparableReport.append(person.getId()).append(" ").
                        append(person.getFirstName()).append(" ").
                        append(person.getLastName()).append(" ").
                        append(person.getState());
                bw.write(cbComparable.statesComparableReport.toString());
                cbComparable.statesComparableReport.delete(0, cbComparable.statesComparableReport.length());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Unable to write to a file: " + outFile.toString());
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                System.out.println("Unable to close a file: " + outFile.toString());
            } catch (NullPointerException ex) {
                ex.printStackTrace();
            }
        }
    }
}
