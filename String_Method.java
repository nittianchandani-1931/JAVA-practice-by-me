public class String_Method {
    public static void main(String[] args) {
        String name = "Vikas chaurasiya Vikas Vikas Vikas";
        // int length = name.length();
        // char c = name.charAt(length - 1);
        // String name2 = "vikas chaurasiya";
        // System.out.println(name.equals(name2));
        // System.out.println(name.equalsIgnoreCase(name2)); // mtlb upper case aur
        // lowercase agr hai h same letter ka to ignore krega
        // System.out.println( length );

        // String str1 = "vikas";
        // String str2 = "chandani";
        // System.out.println('r' + 0);
        // System.out.println('c' + 0);

        // int i = str2.compareTo(str1);
        // System.out.println(i);

        // String substring = name.substring(5, 8);
        // System.out.println(substring);
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.trim());
       String newName = name.replace("Vikas", "Chandani");
       System.out.println(newName);

    }

}
