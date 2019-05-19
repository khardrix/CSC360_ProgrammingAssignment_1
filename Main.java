/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                       Programming Assignment #1                                           *****
 *****___________________________________________________________________________________________________________*****
 *****                                                                                                           *****
 *****   This assignment will test your ability to define your own Exception classes, use exception handling,    *****
 *****                               define an Interface and implement interfaces.                               *****
 *****                                                                                                           *****
 *****                      The basic idea of this assignment is to write your own Date class                    *****
 *****                     (since one exists in Java, call it something different like MyDate).                  *****
 *****                                                                                                           *****
 *****                                        The UML is given below.                                            *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                                                                                           *****
 *****                                        -month, day, year: int                                             *****
 *****                                        +MyDate()                                                          *****
 *****                                        +MyDate(fullDate: String) throws IllegalDateException              *****
 *****                                        +getMonth(): String                                                *****
 *****                                        -getMonthAsInt() : int                                             *****
 *****                                        +getDay(): int                                                     *****
 *****                                        +getYear(): int                                                    *****
 *****                                        +setMonth(month: int) throws IllegalDateException                  *****
 *****                                        +setDay(day: int) throws IllegalDateException                      *****
 *****                                        +setYear(year: int)                                                *****
 *****                                        +toString(): String                                                *****
 *****                                                                                                           *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****       The no-arg constructor should set the MyDate’s date to the date of when you write the program.      *****
 *****   For instance, if the date is May 8, 2018 then the no-arg constructor will set the date to 5, 8, 2018.   *****
 *****                                                                                                           *****
 *****                    The 1-arg constructor receives a String in the form “01/02/2003”.                      *****
 *****  You will have to parse this String using substring to get the three parts of it month, day and year and  *****
 *****                  then parse each item as an int to store the three in their instance data                 *****
 *****                         (e.g., store “01” as 1 in month and “2003” as 2003 in year).                      *****
 *****         The MyDate will be stored as three int values, so “01/02/2003” would be stored as 1, 2, 2003.     *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****          The MyDate class will have accessors and mutators for all three values (month, day, year).       *****
 *****                           The getMonth() method will return the month as a String,                        *****
 *****          so you have to convert from the int value (e.g., 5) to the name of the month (e.g., “May”).      *****
 ***** All three mutators (setMonth, setDay, setYear) will receive an int value (month, day, year respectively). *****
 *****                        Both setMonth and setDay can throw an IllegalDateException                         *****
 *****                       if the month or day is not correct (as can the constructor).                        *****
 *****                          The month is invalid if it is not between 1 and 12 and                           *****
 *****          the day is invalid if it is less than 1 or greater than the maximum date for that month.         *****
 *****                 NOTE: do not worry about leap years, always assume February has 28 days.                  *****
 *****             Assume year is always valid so that setYear will not throw an IllegalDateException.           *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****            The toString method should return the String in the form “01/02/03” or “01/02/1998”.           *****
 *****                   If the month and day are single digits, prepend the digit with a ‘0’.                   *****
 *****              If the year is 2000, use the String “00”, if the year is between 2001 and 2009,              *****
 *****           output the year as two digits as in “03” (prepend a 0) and if the year is after 2009,           *****
 *****     output it as two digits, however if the year is before 2000, then output the year in four digits,     *****
 *****                       so you get “03” for 2003, “18” for 2018 and “1998” for 1998.                        *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****                         The IllegalDateException will require two constructors,                           *****
 *****                  a no-arg constructor which will simply do super(“some useful message”);                  *****
 *****                                   such as “Bad date specified”;                                           *****
 *****                                                                                                           *****
 *****                    and a 1-arg constructor which will pass on the message it receives.                    *****
 *****   The IllegalDateException can be thrown from the MyDate constructor, setMonth and setDay methods only.   *****
 *****     In each case, throw a useful message such as “Bad Month: 13” or “Bad Day: there is no April 31”.      *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****                    MyDate will implement two interfaces, Comparable and Incrementable.                    *****
 *****                 Comparable requires implementing a compareTo method to compare two MyDates.               *****
 *****   To compare two MyDates, obtain the other MyDate’s month, day and year using MyDate’s accessor methods.  *****
 *****                    To compare this MyDate to another MyDate, use the following logic.                     *****
 *****                          This MyDate > other MyDate if this year > other year, or                         *****
 *****                          if the years are the same, this month > other month, or                          *****
 *****                         if the year and month are the same, this day > other day.                         *****
 *****                     If all three instance data are the same, the two MyDates are equal.                   *****
 *****                                  Note that getMonth returns a String.                                     *****
 ***** For compareTo, you will need other’s month, but rather than having to convert it from a String to an int, *****
 *****                    implement a second getMonth method which returns month as an int.                      *****
 *****          You cannot overload the two getMonth methods because neither has a parameter to                  *****
 *****     indicate which one should be called, so call this method something else like getMonthAsInt.           *****
 *****                Make this method private since it will only be used internally (by compareTo).             *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****                  Incrementable does not exist so you must first define it as an Interface.                *****
 *****                      The interface will contain one abstract method called increment,                     *****
 *****                             which is a void method and receives no parameters.                            *****
 *****               Implement the Incrementable interface in MyDate by having an increment method which         *****
 *****                  increments the MyDate by 1 day. If the day goes beyond the end of this month,            *****
 *****                        increment the month by 1 and if this moves the month passed 12,                    *****
 *****                              make the month January and increment the year by 1.                          *****
 *****                  For instance, incrementing May 31, 2018 would change the date to June 1, 2018.           *****
 *****                                 Again, ignore the possibility of leap years.                              *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****     Once you have your Incrementable interface, IllegalDateException and MyDate classes implemented,      *****
 *****                            implement a user program to create and use a MyDate.                           *****
 *****               The program will open a text file and input a series of commands from the file.             *****
 *****                                     The commands will be of the form:                                     *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                                                                                           *****
 *****           create newdate – where newdate will be a String in the form “01/02/03”                          *****
 *****           setmonth newmonth – where newmonth will an int                                                  *****
 *****           setday day – where day will be an int                                                           *****
 *****           setyear year – where year will be an int (assumed to be 4 digits long as in 1998 or 2008)       *****
 *****           compare newDate – where newDate will be a String expressing another date,                       *****
 *****                             to handle this instruction, you will have to construct another MyDate with    *****
 *****                             this String and compare the current MyDate                                    *****
 *****           output – this will output the existing MyDate using its toString method                         *****
 *****           outputmonth – same but only the month using getMonth                                            *****
 *****           outputday – same but just the day using getDay                                                  *****
 *****           outputyear – same but just the year using getYear                                               *****
 *****           increment – this will invoke the increment method of the existing MyDate                        *****
 *****                                                                                                           *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                         The input file will contain a series of such commands.                            *****
 *****                           For each command, parse the command itself and if                               *****
 *****                          the command is one that requires a second parameter                              *****
 *****                     (create, setmonth, setday, setyear, compare), input it as well.                       *****
 *****                If the command is create, set the MyDate variable to a new MyDate object,                  *****
 *****                                otherwise use the existing MyDate object.                                  *****
 *****                                       If the command is compare,                                          *****
 *****              then pass to the existing MyDate object the message compareTo(new MyDate(newDate)).          *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****    Open the input file and use a while loop that iterates through the file using while(input.hasNext().   *****
 *****               Some of the commands will be erroneous (either an illegal command such as delete,           *****
 *****                                   or a misspelled command like creat).                                    *****
 *****           Upon receiving a String that is not a legal command, throw an IllegalCommandException.          *****
 *****                         This is another Exception class you will have to write.                           *****
 *****         Assume every legal command has correct parameters and illegal commands have no parameters.        *****
 *****                             The reason for this is to simplify your code.                                 *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****                The IllegalCommandException should have a no-arg and a 1-arg constructor,                  *****
 *****  just like the IllegalDateException. In your user program, when you throw a new IllegalCommandException,  *****
 *****          the message should include that the input command was not known and include that command,        *****
 *****                as in “Illegal command input: incr”. Organize your user program as follows.                *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                                                                                           *****
 *****                    // any declarations                                                                    *****
 *****                    try {                                                                                  *****
 *****                        // open the input file here                                                        *****
 *****                        while(input.hasNext()) {                                                           *****
 *****                            try {                                                                          *****
 *****                                // get the next command and process it (e.g., call the appropriate         *****
 *****                                // method of your MyDate instance datum                                    *****
 *****                                If illegal, throw IllegalCommandException                                  *****
 *****                                If legal and has a parameter, input parameter                              *****
 *****                                Based on instruction, execute the appropriate MyDate method                *****
 *****                            }                                                                              *****
 *****                            catch blocks                                                                   *****
 *****                        }                                                                                  *****
 *****                    }                                                                                      *****
 *****                    catch(IOException) {…}                                                                 *****
 *****                                                                                                           *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                 The catch blocks in the inner try should catch IllegalCommandException,                   *****
 *****               IllegalDateException and NumberFormatException (three separate catch blocks).               *****
 *****          The NumberFormatException block is used if an input is expected to be an int and is not.         *****
 *****                                   For instance, setMonth(“February”).                                     *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****                After writing and compiling this second Exception class and your user class,               *****
 *****                   run the program on the two input files posted with this assignment.                     *****
 *****           The first input file also has the output that is expected for you to test your program.         *****
 *****               Once you have fully debugged your program and are getting the expected output,              *****
 *****       run it on the second input file, collect the output and submit all of your program code along       *****
 *****                                with the output from the second input file.                                *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****     NOTE: when you examine my output, you will see that in my user class after incrementing the date,     *****
 *****          I also output the new date. Also, when comparing two dates, I output what the dates are.         *****
 *****                            These additions to the output are strictly optional.                           *****
 *****                                                                                                           *****
 *****                                                                                                           *****
 *****          Submission of this assignment should be by email to foxr@nku.edu by the listed due date.         *****
 *****             For convenience, please either place all files into a single zip file or copy and             *****
 *****      paste all code and output into a Word document. Make sure all of your code is well commented.        *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

public class Main {

    public static void main(String[] args) {

        try{
            MyDate date1 = new MyDate("12/31/1979");
            MyDate date2 = new MyDate("10/21/1980");
            MyDate date3 = new MyDate("09/11/1998");
            MyDate date4 = new MyDate();
            MyDate date5 = new MyDate("01/11/1998");
            MyDate date6 = new MyDate("02/11/1998");
            MyDate date7 = new MyDate("02/11/1998");

            System.out.println(date1.getMonth());

            System.out.println(date1);
            System.out.println(date2);
            System.out.println(date3);
            System.out.println(date4);
            System.out.println(date5);
            System.out.println(date6);

            date1.compareTo(date2);

            date1.increment();
            System.out.println(date1);

            date1.increment();
            System.out.println(date1);
            
        } catch (IllegalDateException e){
            System.out.println(e);
        }

    }
}
