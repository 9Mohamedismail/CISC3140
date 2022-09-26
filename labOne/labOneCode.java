// CODE BY MOHAMED ISMAIL CISC 3140 LAB ONE

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class labOneCode {
    public static void main(String[] args) {

        LocalDate currentdate = LocalDate.now();

        long labOne = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 9, 28));
        long labTwo = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 10, 26));
        long labThree = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 11, 23));
        long labFour = ChronoUnit.DAYS.between(currentdate, LocalDate.of(2022, 12, 7));
        
        Month currentMonth = currentdate.getMonth();
        int currentDay = currentdate.getDayOfMonth();

        System.out.println("Hello Student! Your current date is: " + currentMonth + " " + currentDay);
        System.out.println("Days until the next labs: ");
        
        System.out.println("");
        System.out.println("LAB ONE: " + labOne);
        System.out.println("LAB TWO: " + labTwo);
        System.out.println("LAB THREE: " + labThree);
        System.out.println("LAB FOUR: " + labFour);
    }


}

