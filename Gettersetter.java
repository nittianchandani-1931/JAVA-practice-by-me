    class Human {
    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String  getName(){
        return name;
    }
    public void setName(String b){
        name = b;
    }
}

public class Gettersetter {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName ("Vikas");
        System.out.println(obj.getName() + " - " + obj.getAge());
    }
}


