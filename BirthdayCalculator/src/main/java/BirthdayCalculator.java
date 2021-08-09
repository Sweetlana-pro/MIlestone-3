
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.MonthDay;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.WeekFields;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Sweetlana Protsenko
 */
public class BirthdayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("******Welcome to the MAGICAL BIRTHDAY CALCULATOR!*****");
        
        System.out.println("What is your Birthday (yyyy-MM-dd)?");
        String birthDate = sc.nextLine();
        
        LocalDate ld = LocalDate.parse(birthDate);
        String weekDay = ld.format (
            DateTimeFormatter.ofPattern("EEEE"));
        
        //LocalDate weekDay = LocalDate.parse(birthDate,new DateTimeFormatterBuilder().appendPattern("YYYY w").parseDefaulting(WeekFields.ISO.dayOfWeek(), 1).toFormatter()));
                
                
        System.out.println("That's means you were born on a " + weekDay + ".");
        
        //MonthDay currentYearBirthday = birthDate)
        LocalDate past = LocalDate.parse(birthDate);
        
        LocalDate today = LocalDate.now();
        
        
        System.out.println("This year it falls on a " );
        
    }
    public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THIRSDAY, FRIDAY, SATURDAY, SUNDAY
    
}
    
}
