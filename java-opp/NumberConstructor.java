//its a constructor over loading exercise!! for under standing 

class NumberConstructor {
    NumberConstructor(float x, float y) {
        this(20,33);

        System.out.println(x > y ? x : y);
    }

    NumberConstructor(int x, int y) {
        this();//this fun calls the current class constructor.

        System.out.println(x > y ? x : y);
    }

    NumberConstructor() {

        System.out.println("its a void constuctor");
    }

    public static void main(String[] args) {
        NumberConstructor obj = new NumberConstructor(4.6f,6.9f);
        NumberConstructor obj1 = new NumberConstructor();

        NumberConstructor obj2 = new NumberConstructor(9,5);

    }

}