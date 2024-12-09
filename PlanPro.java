import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class PlanPro{
  public static void main(String args[])throws IOException{
  System.out.println("Hello welcome to your very own virtual grader!");
    Scanner in = new Scanner(System.in);
    boolean checkFile = false;
    String filename = " ";
    System.out.println("What student would you like to see?");
    while(true){
    try{
    filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    break;
    }
    catch(Exception e){
      System.out.print("Student not found. Enter again: ");
      continue;
    }
     }
    Scanner fin = new Scanner(new File(filename));
    ArrayList<Integer> studentInfo = new ArrayList<Integer>();
    int empty = 0;
    fin.nextLine();
    while(fin.hasNextLine()){
      empty = Integer.parseInt(fin.nextLine());
      studentInfo.add(empty);
      fin.nextLine();
    }
    System.out.println("Math: " + studentInfo.get(0));
    System.out.println("Science: " + studentInfo.get(1));
    System.out.println("English: " + studentInfo.get(2));
    System.out.println("Social Studies: " + studentInfo.get(3));
    System.out.println("PE: " + studentInfo.get(4));
  }
  }


