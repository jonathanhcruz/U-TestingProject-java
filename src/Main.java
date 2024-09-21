import java.util.HashMap;
import java.util.TreeMap;



public class Main {
    public static void main(String[] args) {
        CreateUser user1 =  new CreateUser(
            "001",
            "John Doe",
            1,
            152
        );

        if (user1.isValidUser()) {
            System.out.println("User is valid");
            System.out.println("Code of employee: " + user1.getCodeOfEmployee());
        } else {
            System.out.println("User is invalid");
        }


        System.out.println("=====================================");
        System.out.println("=====================================");


        CreateUser user2 =  new CreateUser(
                "010",
                "John$Doee",
                3,
                601
        );

        if (user2.isValidUser()) {
            System.out.println("User is valid");
            System.out.println("Code of employee: " + user2.getCodeOfEmployee());
        } else {
            System.out.println("User is invalid");
        }
    }
}