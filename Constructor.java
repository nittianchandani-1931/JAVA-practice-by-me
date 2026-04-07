class Human {
    private int age;
    private String name;

    public Human() {
        // System.out.println("In Constructor");
        age = 23;
        name = "Vikas";
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
        System.out.println(obj.getName() + ":" + obj.getAge());

        // obj.setAge(30);
        // obj.setName("Vikas");
        // System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
