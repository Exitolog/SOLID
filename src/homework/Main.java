package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.save();
        Manager manager = new Manager("Andy");
        manager.report(user);
    }
}
