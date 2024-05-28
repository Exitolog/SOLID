package homework;

public class Manager implements Reportable  {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user);
    }
}
