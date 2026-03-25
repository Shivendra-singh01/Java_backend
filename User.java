public class User {
    String name;
    int age;
   
    public User(String name,int age)   {
        if(age>=0){
         this.name=name;
         this.age=age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

     void display() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        }

    public static void main(String[] args) {
        User user = new User("Anshul",22);
        user.display();
        
    }
}

