public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("java is the worst programming language");
        System.out.println("string:" + st);
        st.append("and c");
        st.insert(0, "c++,");
        System.out.println("after inserting:" + st);
        st.delete(1, 4);
        System.out.println("after deleting:" + st);
        System.out.println("capacity:" + st.capacity());
        st.ensureCapacity(100);
        System.out.println("capacity after increasing:" + st.capacity());
        st.reverse();
        System.out.println("after reverse:" + st.reverse());
    }

}
