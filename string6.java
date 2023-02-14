public class string6 {
    public static void main(String[] args) {
        String s = new String("hello simran");
        String s2 = new String("DEVANSHI");
        char ch[] = new char[10];
        s.getChars(2, 4, ch, 0);
        System.out.println(ch);
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        char[] ch2 = s.toCharArray();
        for (int i = 0; i < ch2.length; i++) {
            System.out.println(ch2[i]);
        }
        String s3 = "devanshi";
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
