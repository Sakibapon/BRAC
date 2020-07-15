import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MIDTask02 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner file = new Scanner(new File("D:\\code.txt"));

        List<String> Keywords = Arrays.asList("def", "and", "if", "else","for");
        List<String> MathOperations = Arrays.asList("+", "-", "=", "else");
        List<String> LogicalOperations = Arrays.asList(">", "<");
        List<String> Others = Arrays.asList(",", ";", "(", ")","{","}");
       
        List<String> all = new ArrayList<String>();
       
        List<String> KeyOut = new ArrayList<String>();
        List<String> MathOut = new ArrayList<String>();
        List<String> LogicOut = new ArrayList<String>();
        List<String> IdentyOut = new ArrayList<String>();
        List<String> NumOut = new ArrayList<String>();
        List<String> OtherOut = new ArrayList<String>();

       
        while (file.hasNext()){
            all.add(file.next());
         }
       
        for(int count=0; count<all.size(); count++){
            if (Keywords.contains(all.get(count))){
                if(KeyOut.contains(all.get(count)) == false) KeyOut.add(all.get(count));
            }
            else if (MathOperations.contains(all.get(count))){
                if(MathOut.contains(all.get(count)) == false) MathOut.add(all.get(count));
            }
            else if (LogicalOperations.contains(all.get(count))){
                if(LogicOut.contains(all.get(count)) == false) LogicOut.add(all.get(count));
            }
            else if (Others.contains(all.get(count))){
                if(OtherOut.contains(all.get(count)) == false) OtherOut.add(all.get(count));
            }
            else if(Numeric(all.get(count))) {
            NumOut.add(all.get(count));
            }
            else {
            if(IdentyOut.contains(all.get(count)) == false) IdentyOut.add(all.get(count));
            }
        }
        System.out.println("Keywords = " + KeyOut);
        System.out.println("Variable = " + IdentyOut);
        System.out.println("MathOperations = " + MathOut);
        System.out.println("LogicalOperations: " + LogicOut);
        System.out.println("Numerical Values: " + NumOut);
        System.out.println("Others: " + OtherOut);
    }
   
    public static boolean Numeric(String number) {
    double i;
    try {
    i = Double.valueOf(number);
    return true;
    }
    catch(Exception e) {
    return false;
    }
    }
}