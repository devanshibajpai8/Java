public class string7 {
    public static void main(String[] args) {
        String s = "devanshi bajpai", s1 = "baj";
        System.out.println("is shi present in s:" + s.regionMatches(2, s1, 0, 4));
        System.out.println("is s starting with d:" + s.startsWith("d"));
        System.out.println("is s1 ends with a:" + s1.endsWith("a"));
        System.out.println("comparing s with s1:" + s.compareTo(s1));
    }

}
