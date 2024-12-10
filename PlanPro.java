import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class PlanPro{
  static double studentAvg(double math, double sci, double eng, double ss, double pe){
    return (math + sci + eng + ss + pe)/5;
  }
  static String performance( double average){
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String CYAN = "\u001B[36m";
    String RED = "\u001B[31m";
    String RESET = "\u001B[0m";
    if(average >= 90){
      return GREEN + "You're a genius, keep up the good work!" + RESET;
    }
    if(average >= 80){
      return YELLOW + "You're doing okay, don't forget to study!" + RESET;
    }
    if(average >= 70){
      return CYAN + "Let's focus some more, youre about to fail..." + RESET;
    }
    return RED + "Get back on the grind" + RESET;
    }
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
    System.out.println("file name"+ filename);
    break;
    }
    catch(Exception e){
      System.out.print("Student not found. Enter again: ");
      continue;
    }
     }
    Scanner fin = new Scanner(new File(filename));
    ArrayList<Double> studentInfo = new ArrayList<Double>();
    double empty = 0;
    System.out.println(fin.nextLine());
    while(fin.hasNextLine()){
      empty = Double.parseDouble(fin.nextLine());

      studentInfo.add(empty);
    }
    System.out.println("Math: " + studentInfo.get(0));
    System.out.println("Science: " + studentInfo.get(1));
    System.out.println("English: " + studentInfo.get(2));
    System.out.println("Social Studies: " + studentInfo.get(3));
    System.out.println("PE: " + studentInfo.get(4));
    double average1 = studentAvg(studentInfo.get(0), studentInfo.get(1), studentInfo.get(2), studentInfo.get(3), studentInfo.get(4));
    System.out.println("Students average: " + average1);
    System.out.println(performance(average1));
  }
  }



