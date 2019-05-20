/*********************************************************************************************************************
 *********************************************************************************************************************
 *****  Class: CSC-360-001-2019-040    Semester: Summer 2019    Professor: Richard Fox    Student: Ryan Huffman  *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                       Programming Assignment #1                                           *****
 *****                                    Exception : IllegalDateException                                       *****
 *****___________________________________________________________________________________________________________*****
 *****                         The IllegalDateException will require two constructors,                           *****
 *****                  a no-arg constructor which will simply do super(“some useful message”);                  *****
 *****                                   such as “Bad date specified”;                                           *****
 *****                                                                                                           *****
 *****                      A 1-arg constructor which will pass on the message it receives.                      *****
 *****   The IllegalDateException can be thrown from the MyDate constructor, setMonth and setDay methods only.   *****
 *****     In each case, throw a useful message such as “Bad Month: 13” or “Bad Day: there is no April 31”.      *****
 *********************************************************************************************************************
 *********************************************************************************************************************/


// Exception class that extends Exception, used to handle when inputted dates don't exist.
// For example; If the inputted date has a month less than "01" or greater than "12 or
    // when the inputted day is less than "01" or greater than the number of days in its corresponding month.
    // Like if the day is 30 and the month is February. There is no "February 30th."
public class IllegalDateException extends Exception {

    // No-argument constructor used to pass "Bad date specified" to the parent (Exception) class that
        // IllegalDateException extends from.
    // This no-arg constructor also prints "Bad date specified" to the console.
    public IllegalDateException(){
        super("Bad date specified");
        System.out.println("Bad date specified");
    }

    // A 1-argument constructor to take in an error message.
        // Then, print that passed in String error message to the console.
    public IllegalDateException(String message){
        System.out.println(message);
    }
}
