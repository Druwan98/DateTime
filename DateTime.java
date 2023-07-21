package exercises.DateTime;

//Using LocaleDate or another Date class calculate and print:
//How many days are left till the end of the month.
//How many days are left till the end of the year, using the length() method from java.time.Year.of()

import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int endMonthMissing =  localDate.lengthOfMonth() - localDate.getDayOfMonth();
        int endYearMissing = localDate.lengthOfYear() - localDate.getDayOfYear();

        System.out.println("There are " + endYearMissing + " days left until the end of the year." );
        System.out.println("There are " + endMonthMissing + " days left at the end of the month.");











}
}
