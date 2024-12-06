import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class PlanPro{
  public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  ArrayList<String> events = new ArrayList<String>();
  System.out.println("Hello welcome to your very own virtual planner!");
  System.out.println("Would you like to view your events or add? (For events type 'events' and for adding type 'add')");
  String ask = in.nextLine();
  if(ask.equals("events")){
  }
  else if(ask.equals("add")){
    System.out.println("Below enter the numerical month you would like to add to. (1, 2, 3... 12)");
    int month = Integer.parseInt(in.nextLine());
    System.out.println("Below enter the numerical day you would like to add to. (1, 2, 3... 30/31)");
    int day = Integer.parseInt(in.nextLine());
    if(month == 1){
      System.out.println("January " + day);
    }
    if(month == 2){
      System.out.println("Febuary " + day);
    }
    if(month == 3){
      System.out.println("March " + day);
    }
    if(month == 4){
      System.out.println("April" + day);
    }
    if(month == 5){
      System.out.println("May " + day);
    }
    if(month == 6){
      System.out.println("June " + day);
    }
    if(month == 7){
      System.out.println("July " + day);
    }
    if(month == 8){
      System.out.println("August " + day);
    }
    if(month == 9){
      System.out.println("September " + day);
    }
    if(month == 10){
      System.out.println("October " + day);
    }
    if(month == 11){
      System.out.println("November " + day);
    }
    if(month == 12){
      System.out.println("December " + day);
    }
  }
  else{
    System.out.println("nothing");
  }
  }
  }
