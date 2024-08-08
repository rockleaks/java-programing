/**
 * Test
 */
import java.util.Scanner;

abstract class College {
    String name;
    String type;
    
    College() {
        this.name = "Bharath University";
        this.type = "Private University";
        System.out.printf("%s Welcomes You!", name);
    }
    void enter() {
        System.out.println("Entered College");
    }
 
}

abstract class Campus extends College {
    Scanner sc = new Scanner(System.in);
    Campus() {
        System.out.println("Admin Welcomes You!");
    }

    void admin() {
        System.out.println("Admin Welcomes You!");
    }
    void enter() {
        System.out.println("Entered Campus");
    }

    abstract void designation();
}

class User extends College {
    User() {
        System.out.println("Enter your choice: \n1. Staff\n2. Student\n3. Admin");
    }
}
class staff extends Campus {
    void designation() {
        System.out.println("Working as a faculty");
    }
}

class student extends Campus {
    void designation() {
        System.out.println("Studying as a Student");
    }
}

public class Test {
    void admin() {
        System.out.println("Weeee");
    }
    public static void main(String[] args) {
        User ur = new User();
    }
}