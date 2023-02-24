package OOPs.Car;

class Car {
    int i;
    int j;
    int k;

    Car(int i, int j, int k){
        this.i = i;
        this.j = j;
        this.k = k;
    }
}
class Bugatti extends Car {
    int z;

    Bugatti(int i, int j, int k) {
        super(i, j, k);
        this.z = z;
//        super(i, j, k); // first line of constructor must be super();
    }

    int get_z() {
        return z;
    }

    void set_z(int z) {
        this.z = z;
    }
}

public class Test_class {
    public static void main(String[] args) {

        Bugatti chivron = new Bugatti(1, 2, 3);

        System.out.println("i is " + chivron.i);
        System.out.println("j is " + chivron.j);
        System.out.println("k is " + chivron.k);
        System.out.println("z is " + chivron.get_z());
    }
}
