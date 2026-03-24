    class Student {
    int rollno;
    String name;
    int marks;
}

public class Enhancedfor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "chandani";
        s1.marks = 99;

  Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "vikas";
        s2.marks = 95;

  Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "chabbi";
        s3.marks = 89;

Student students [] = new Student[3]; // Arrays of which holds student references

students[0] = s1;
students[1] = s2;
students[2] = s3;


for(Student stud : students){
    System.out.println(stud.name + ":"+ stud.marks );
}








// for(int i=0;i<students.length;i++){
//     System.out.println(students[i].name + " : " + students[i].marks);
// }

        // int nums[] = new int[6];
        // nums[0] = 4;
        // nums[1] = 3;

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

//         for(int n : nums){
//             System.out.println(n);
//         }
}
}
