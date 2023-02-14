class stat {
    static int count_stat = 1;

    stat() {
        count_stat++;
        System.out.println(count_stat);
    }
}

class non_static {
    int count_nonstat = 1;

    non_static() {
        count_nonstat++;
        System.out.println(count_nonstat);
    }
}

public class static_nstatic {
    public static void main(String[] args) {
        stat s1 = new stat();
        stat s2 = new stat();
        non_static n1 = new non_static();
        non_static n2 = new non_static();
    }
}
