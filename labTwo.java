// CODE BY MOHAMED ISMAIL CISC 3140 LAB TWO
// Hello CISC 1115 Student! Want to edit this to allow for YYYY-MM-DD instead? Simply go to the "changeDate" functon and read the below comments too!

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.time.format.DateTimeFormatter;

public class labTwo {
  public static void main(String[] args) {

  boolean rerun = true;
  while(rerun) {
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // CISC 1115 student - Change this to yyyy/MM/dd if you want. It's up to you.
    String parsedDate = date.format(formatter);
    int secondChoice; int retry;

    Scanner input = new Scanner(System. in );

    System.out.println("\nHello Student! Your current date is: " + parsedDate + ". Would you like to change this?");
    System.out.println("(1) - Leave current date");
    System.out.println("(2) - Change date");

    int firstChoice = input.nextInt();

    if (firstChoice == 2) {
      parsedDate = changeDate(input);
      date = LocalDate.parse(parsedDate, formatter);
    }

    System.out.println("\nYour choice: " + firstChoice);
    System.out.println("\nOkay, Your current date is: " + parsedDate + ". Please choose from list of dates below: ");
    System.out.println("LAB OPTIONS: (1) - LAB1 (2) - LAB2 (3) - LAB3 (4) - LAB4 (5) - LAB5\nQUIZ OPTIONS: (6) - QUIZ1 (7) - QUIZ2 (8) - QUIZ3 (9) - QUIZ4 (10) - QUIZ5\n(11) - Final date\n(12) - Choose your own date");

    do {
      secondChoice = input.nextInt();
      System.out.println("\nYour choice: " + secondChoice);
      switch (secondChoice) {
      case 1: case 2: case 3: case 4: case 5:
        labDate(secondChoice, date);
        break;
        case 6: case 7: case 8: case 9: case 10:
        quizDate(secondChoice, date);
        break;
      case 11:
        System.out.println("\nDays until FINAL: " + ChronoUnit.DAYS.between(date, LocalDate.of(2022, 12, 19)));
        break;
      case 12:
        parsedDate = changeDate(input);
        LocalDate choosenDate = LocalDate.parse(parsedDate, formatter);
        System.out.println("\nDays until parsedDate: " + ChronoUnit.DAYS.between(date, choosenDate));
        break;
      default:
        System.out.println("Please retry and make sure spelling is correct");
        break;
      }
    } while (( secondChoice < 1 ) || (secondChoice > 12));

    System.out.println("Do you want to rerun the program? Type (1) for Yes and (2) for No.");
    retry = input.nextInt();

    if (retry == 1) {
      rerun = true;
      System.out.println("\nRerunning program!");
    } else {
      System.out.println("\nGoodBye!");
      rerun = false;
      System.exit(0);
    }

  }

  }
  // This functions allows the user to change the date to what they want.  The only thing it takes in is the scanner.
  public static String changeDate(Scanner sc) {  
    String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";  // If you are a CISC 1115 student, edit this regex to allow for YYYY-MM-DD
    String regexTwo = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])$"; // Also edit this line so that it allows for MM-DD. The program will automatically put in the YEAR
    Pattern pattern = Pattern.compile(regex);
    Pattern patternTwo = Pattern.compile(regexTwo);
    boolean correctDate = false;
    boolean correctDateTwo = false;
    String date;

    System.out.println("Ok. Please input a new date with the format MM/DD/YYYY");

    do {
      date = sc.next();
      Matcher matcher = pattern.matcher(date);
      Matcher matcherTwo = patternTwo.matcher(date);

      correctDate = matcher.matches();
      correctDateTwo = matcherTwo.matches();

      if (correctDate == true) {
        correctDateTwo = true;
        continue;
      } else if (correctDateTwo == true) {
        correctDate = true;
        date += "/2023";
      } else {
        System.out.println("Please retry and make sure spelling is correct");
      }

    } while ( correctDate == false || correctDateTwo == false );

    return date;

  }

  // This function calculates the lab dates. It takes in the choice of the user (which lab they want to get) and the date (this could be the local or the changed one)
  public static void labDate(int choice, LocalDate currentdate) { 

    long labOne = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 9, 28));
    long labTwo = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 10, 26));
    long labThree = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 11, 23));
    long labFour = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 12, 7));

    System.out.print("\nDays until ");

    switch (choice) {
    case 1:
      System.out.print("LAB ONE: " + labOne);
      break;
    case 2:
      System.out.print("LAB TWO: " + labTwo);
      break;
    case 3:
      System.out.print("LAB THREE: " + labThree);
      break;
    case 4:
      System.out.print("LAB FOUR: " + labFour);
      break;
    }
  }

  // This function calculates the quiz dates. It takes in the choice of the user (which lab they want to get) and the date (this could be the local or the changed one)
  public static void quizDate(int choice, LocalDate currentdate) {

    long quizOne = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 9, 14));
    long quizTwo = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 9, 28));
    long quizThree = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 10, 26));
    long quizFour = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 11, 16));
    long quizFive = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 12, 7));

    System.out.print("\nDays until ");

    switch (choice) {
    case 6:
      System.out.print("QUIZ ONE: " + quizOne);
      break;
    case 7:
      System.out.print("QUIZ TWO: " + quizTwo);
      break;
    case 8:
      System.out.print("QUIZ THREE: " + quizThree);
      break;
    case 9:
      System.out.print("QUIZ FOUR: " + quizFour);
      break;
    case 10:
      System.out.print("QUIZ FIVE: " + quizFive);
      break;
    }
  }

}