class outer {
    void sum_out() {
        int d = 8;

        System.out.println("By Inside Outer method value of d is:" + d);

        class inner {
            void sum_in() {
                System.out.println("By Inside Inner method value of d is:" + d);
            }
        }
        inner obj = new inner();
        obj.sum_in();
    }
}

public class inner_class {
    public static void main(String[] args) {
        outer obj1 = new outer();
        obj1.sum_out();

    }
}
