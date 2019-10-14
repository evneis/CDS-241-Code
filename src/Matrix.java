import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.Integer;

public class Matrix {
    private int numRows, numCols;
    private ArrayList<ArrayList<Integer>> rows;


    //TODO
    //row and col must be > 0; if row < 0 or col < 0, the Matrix cannot be created
    public Matrix(int row, int col){

        numRows = row;
        numCols = col;
       /* assert row > 0;
        assert col > 0; */
        try {
            rows = new ArrayList<ArrayList<Integer>>(numRows);
            for (int r = 0; r < numRows; ++r) {

                ArrayList<Integer> theRow = new ArrayList<Integer>(numCols);
                rows.add(theRow);

                for (int c = 0; c < numCols; ++c) {
                    theRow.add(null);
                }
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("ERROR");
        }
        /* You could also throw an IllegalArgumentException in
        the header. I was testing if catching it here would work
         */

    }


    //TODO
    //We should check that 0 <= r <= numRows and 0 <= c <= numCols
    public Integer get(int r, int c){
        assert 0 <= r && r < numRows: r;
        assert 0 <= c && c < numCols;

        ArrayList<Integer> theRow = rows.get(r);
        return theRow.get(c);
    }

    //TODO
    //We should check that 0 <= r <= numRows and 0 <= c <= numCols
    public void set(int r, int c, Integer obj){
        assert 0 <= r && r < numRows;
        assert 0 <= c && c < numCols;

        ArrayList<Integer> theRow = rows.get(r);
        theRow.set(c, obj);
    }


    public int getNumRows(){
        return numRows;
    }


    public int getNumCols(){
        return numCols;
    }

    public void readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner in = new Scanner(file);

        for(int r = 0; r < 3; ++r){
            for(int c = 0; c < 4; ++c){
              //  String i = String.valueOf(in.nextInt());
                int j = in.nextInt();
                this.set(r,c, j);
            }
        }
    }

    public void writeToFile(String fileName) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        try {

            for (int r = 0; r < numRows; r++) {
                ArrayList<Integer> theRow = rows.get(r);

                String line = "";
                for (int c = 0; c < numCols; c++) {
                    line += theRow.get(c);
                    line += " ";
                }
                writer.write(line + "/n");
            }
        }
        catch(IOException e){
            System.out.println("uhoh!");
        }
        finally {
            writer.close();
        }
    }


    public String toString(){
        String matrix = "";
        for(int r = 0; r < numRows; ++r){
            ArrayList<Integer> theRow = rows.get(r);
            matrix = matrix + "\n" + theRow.toString();  //one of the few times we want to directly call the toString method!
        }

        return matrix;
    }



    //This sample main function sets up a 2x3 matrix and prints it out
    public static void main(String args[]) throws FileNotFoundException{
        Matrix mat = new Matrix(3,4);

     /*   for(int r = 0; r < 3; ++r){
            for(int c = 0; c < 4; ++c){
                mat.set(r,c, r+c);
            }
        } */
        mat.readFromFile("matrix.txt");
        System.out.println(mat);

    }

}