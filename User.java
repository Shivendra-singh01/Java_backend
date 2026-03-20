public class User {

    String name;
    int age;

    void display() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        }
    
    public static void main(String[] args) {
        User u = new User();
        u.name="Anshul singh";
        u.age=22;
        u.display();
    
    }
    }

