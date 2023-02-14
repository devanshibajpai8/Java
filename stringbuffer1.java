public class stringbuffer1 {
    public static void main(String args[]) {
        StringBuffer o = new StringBuffer(10);
        System.out.println("capacity=" + o.capacity());
        StringBuffer ob = new StringBuffer(10);
        System.out.println("capacity=" + ob.capacity());
        StringBuffer ob1 = new StringBuffer("devanshi");
        System.out.println("capacity=" + ob1.capacity());
        ob1.setLength(8);
        System.out.println("char at:" + ob1.charAt(2));
        ob1.setCharAt(4, 'e');
        System.out.println("after setting char:" + ob1);
        ob1.deleteCharAt(3);
        System.out.println("after delete:" + ob1);
    }

}
