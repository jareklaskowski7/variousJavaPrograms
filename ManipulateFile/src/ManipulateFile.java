import java.io.*;

public class ManipulateFile {
    private StringBuilder report;

    public ManipulateFile() {
        report = new StringBuilder();
    }

    public static void main(String[] args) {
        ManipulateFile mF = new ManipulateFile();
        //File file = new File("/home/jarek/Documents/variousJavaPrograms/data.txt");
        File file = new File("C:/Prog/codeWin/variousJavaPrograms/data.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(":");
                mF.report.append("Name: ").append(words[0]).append(" ").append(words[1]).append("\n").
                        append("Age: ").append(words[2]).append(" years\n").
                        append("State: ").append(words[3]).append(" State\n\n");
            }
            System.out.println(mF.report.delete(mF.report.length() - 2, mF.report.length()));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException ex) {
                ex.printStackTrace();
                // File was probably never opened!
            }
        }
    }
}
