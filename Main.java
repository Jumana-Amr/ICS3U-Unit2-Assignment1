/*
* Unit2-Assignmet.java
* This calculates and displays the percent of the time taken in each task.
* Jumana Amr
* 27-9-2021
* ICS3U
*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double design;
    double code;
    double testing;
    double debugging;
    double sum = 0;
    double percentd;
    double percentc;
    double percentt;
    double percentde;
    double hour;
    double percentday;
    Scanner input = new Scanner(System.in);
    System.out.print("Design: ");
    design = input.nextDouble();
    System.out.print("Code: ");
    code = input.nextDouble();
    System.out.print("Testing: ");
    testing = input.nextDouble();
    System.out.print("Debugging: ");
    debugging = input.nextDouble();
    System.out.println("Time taken for each task ");
    sum += design+code+testing+debugging;
    percentd = 100/(sum/design);
    percentc = 100/(sum/code);
    percentt = 100/(sum/testing);
    percentde = 100/(sum/debugging);
    System.out.format("%-10s %20s","Designing",((String.format("%.2f",percentd))+(" %\n")));
    System.out.format("%-10s %20s","Code",((String.format("%.2f",percentc))+(" %\n")));
    System.out.format("%-10s %20s","Testing",((String.format("%.2f",percentt))+(" %\n")));
    System.out.format("%-10s %20s","Debugging",((String.format("%.2f",percentde))+(" %\n")));
    hour = sum/60;
    percentday = 100/(24/hour);
    System.out.println("You have spent: "+(String.format("%.2f",percentday))+(" % of the day\n"));
  }
}