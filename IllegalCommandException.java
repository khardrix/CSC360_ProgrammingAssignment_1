/*********************************************************************************************************************
 *********************************************************************************************************************
 *****  Class: CSC-360-001-2019-040    Semester: Summer 2019    Professor: Richard Fox    Student: Ryan Huffman  *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                                       Programming Assignment #1                                           *****
 *****                                   Exception: IllegalCommandException                                      *****
 *****___________________________________________________________________________________________________________*****
 *****                         This is another Exception class you will have to write.                           *****
 *****         Assume every legal command has correct parameters and illegal commands have no parameters.        *****
 *****                             The reason for this is to simplify your code.                                 *****
 *****                                                                                                           *****
 *****                The IllegalCommandException should have a no-arg and a 1-arg constructor,                  *****
 *****  just like the IllegalDateException. In your user program, when you throw a new IllegalCommandException,  *****
 *****          the message should include that the input command was not known and include that command,        *****
 *****                                    as in “Illegal command input: incr”.                                   *****
 *****                                                                                                           *****
 *****    Open the input file and use a while loop that iterates through the file using while(input.hasNext().   *****
 *****               Some of the commands will be erroneous (either an illegal command such as delete,           *****
 *****                                   or a misspelled command like creat).                                    *****
 *****           Upon receiving a String that is not a legal command, throw an IllegalCommandException.          *****
 *****                                                                                                           *****
 *****                                  Organize your user program as follows.                                   *****
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
 *********************************************************************************************************************
 *********************************************************************************************************************/


// Exception class that extends Exception, used to handle incorrect commands (don't exist/misspelled/etc) from input.
public class IllegalCommandException extends Exception {

    // No-argument constructor used to pass "Illegal command input" to the parent (Exception) class that
        // IllegalCommandException extends from.
    // This no-arg constructor also prints "Illegal command input" to the console.
    public IllegalCommandException(){
        super("Illegal command input");
    }

    // A 1-argument constructor to take in an error message.
        // Then, print that passed in String error message to the console.
    public IllegalCommandException(String message){
        super(message);
    }
}
