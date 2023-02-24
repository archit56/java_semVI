package OOPs.Stack;

public class Stack {
    private int tos = -1;
    private int[] stack_arr;

    // constructor
    Stack(int stack_size){
        stack_arr = new int[stack_size];
    }

    void push(int num) {
        tos++;
        if(tos >= stack_arr.length){
            System.out.println("Stack overflow...");
            System.exit(0);
        }
        else {
            this.stack_arr[tos] = num;
        }

    }

    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow...");
            System.exit(0);
            return 0;
        }
        else
            return stack_arr[tos--];
    }

}

class Test_class {
    public static void main(String[] args) {
        Stack marks = new Stack(3);
        marks.push(13);
        marks.push(14);
        marks.push(15);
//        marks.push(16);
        System.out.println(marks.pop());
        System.out.println(marks.pop());
        System.out.println(marks.pop());
//        System.out.println(marks.pop());
    }
}
