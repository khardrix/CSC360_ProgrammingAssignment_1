/*********************************************************************************************************************
 *********************************************************************************************************************
 *****  Class: CSC-360-001-2019-040    Semester: Summer 2019    Professor: Richard Fox    Student: Ryan Huffman  *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                       Programming Assignment #1                                           *****
 *****                                       Interface : Incrementable                                           *****
 *****___________________________________________________________________________________________________________*****
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
 *****     NOTE: when you examine my output, you will see that in my user class after incrementing the date,     *****
 *****               I also output the new date. This addition to the output is strictly optional.               *****
 *********************************************************************************************************************
 *********************************************************************************************************************/


// Interface that holds the "void increment()" method.
// In our case, when we implement the Incrementable Interface, the increment() method is used to
    // increment a date by one day.
// For example, the date "01/01/1980" would become "01/02/1980" after the increment() method was used
    // on the "01/01/1980" date.
public interface Incrementable {

    // One and only method in the Incrementable interface.
    // I left out the "public" and "abstract" keywords in the increment() method header, because they are redundant.
        // All methods in a Java interface are inherently "public" and "abstract".
    void increment();
}
