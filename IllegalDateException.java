

public class IllegalDateException extends Exception {

    public IllegalDateException(){
        super("Bad date specified");
        System.out.println("Bad date specified");
    }

    public IllegalDateException(String message){
        System.out.println(message);
    }
}
