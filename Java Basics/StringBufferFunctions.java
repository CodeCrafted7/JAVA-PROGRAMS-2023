public class StringBufferFunctions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELLO");
        sb.append("Java");
        System.out.println("After appending: " + sb);
        sb.insert(1, "Java");
        System.out.println("After inserting at index 1: " + sb);
        sb.replace(1, 3, "Java");
        System.out.println("After replacing between index 1 and 2: " + sb);
        sb.delete(1, 3);
        System.out.println("After deleting between index 1 and 2: " + sb);

        sb.reverse();
        System.out.println("After reversing: " + sb);
    }
}
