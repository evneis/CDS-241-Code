import java.io.*;
import java.util.Scanner;


public class ScannerFileEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("input.txt");
       // System.err.println(file.getAbsolutePath());
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            int i = scanner.nextInt();
            System.out.println(i);
        }


        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }

        try {
            File file2 = new File("input2.txt");
            Scanner scanner2 = new Scanner(file2);
        }
        catch (FileNotFoundException e){
            System.out.println("BRuh! File aint ther!");
        }
    }

}
