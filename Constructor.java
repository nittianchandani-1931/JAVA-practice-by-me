class Human {
    private int age;
    private String name;

    // public Human() { //Default constructor
    // // System.out.println("In Constructor");
    // age = 22;
    // name = "Vikas";
    // }

    public Human() {
        age = 22;
        name = "Chandani";
    }

    public Human(String name) {
        this.age = 21;
        this.name = name;
    }

    public Human(int age, String name) { // Parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String a[]) {

        Human obj = new Human();
        Human obj1 = new Human(  "Vikas");

        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());

        // obj.setAge(30);
        // obj.setName("Vikas");
        // System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
