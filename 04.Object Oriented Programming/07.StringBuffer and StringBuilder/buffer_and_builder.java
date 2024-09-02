// To make string mutable we use StringBuffer
// StringBuffer is threadsafe StringBuilder is not
class string_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Yash");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // we can append the data
        sb.append(" Patil");
        System.out.println(sb);

        // Assign stringbuffer data to string
        String str = sb.toString();
        System.out.println(str);

        // delete char at particular index in StringBuffer
        sb.deleteCharAt(2);
        System.out.println(sb);

        // insert data at particular index
        sb.insert(3, " Java");
        sb.insert(2, 's');
        System.out.println(sb);
    }
}