package OOPs.Queue;

public class Queue {
    int[] queue_arr;
    int front = -1;
    int rear = -1;

    // constructor
    Queue(int queue_size){
        queue_arr = new int[queue_size];
    }

    void enqueue(int num) {
        rear++;
        if(rear >= queue_arr.length){
            System.out.println("Queue overflow...");
            System.exit(0);
        }
        else queue_arr[rear] = num;
    }

    int dequeue() {
        front++;
        if(front > rear) {
            System.out.println("Queue underflow...");
            System.exit(0);
            return 0;
        }
        else return queue_arr[front];
    }
}

class Test_class {
    public static void main(String[] args) {
        Queue restaurant_line = new Queue(3);
        restaurant_line.enqueue(1);
        restaurant_line.enqueue(2);
        restaurant_line.enqueue(3);
//        restaurant_line.enqueue(4);
        System.out.println(restaurant_line.dequeue());
        System.out.println(restaurant_line.dequeue());
        System.out.println(restaurant_line.dequeue());
//        System.out.println(restaurant_line.dequeue());
    }
}
