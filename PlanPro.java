import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class PlanPro{
  static double studentSum(ArrayList<Double> grades, int ind){
    if (ind == grades.size()){
      return 0;
    }
    return grades.get(ind) + studentSum(grades, ind + 1);
  }
  static double studentAvg(ArrayList<Double> grades){
    double sum = studentSum(grades, 0);
    return sum / grades.size();
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
    System.out.printf("Math: %.0f", studentInfo.get(0));
    System.out.println(" ");
    System.out.printf("Science: %.0f", studentInfo.get(1));
    System.out.println(" ");
    System.out.printf("English: %.0f", studentInfo.get(2));
    System.out.println(" ");
    System.out.printf("Social Studies: %.0f", studentInfo.get(3));
    System.out.println(" ");
    System.out.printf("PE: %.0f", studentInfo.get(4));
    System.out.println(" ");
    double average1 = studentAvg(studentInfo);
    System.out.printf("Students average: %.1f", average1);
    System.out.println(" ");
    System.out.println(performance(average1));
    studentInfo.sort(null);
    System.out.printf("Highest score: %.0f", studentInfo.get(studentInfo.size()-1));
  }
  }



