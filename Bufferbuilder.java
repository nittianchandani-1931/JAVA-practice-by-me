public class Bufferbuilder {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Chandani");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        sb.append(" Kumari");
        // sb.deleteCharAt(5);
        sb.insert(0,"java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        // String str = sb.toString();
                System.out.println(sb);

    }
}
