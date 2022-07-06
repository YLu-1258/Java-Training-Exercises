public class ClassesAndObjects {
    public static void main(String[] args) {
        Me Me1 = new Me("Alex", 15);
        System.out.println(Me1.getName());
        System.out.println(Me1.getAge());
    }
}

class Me {
    String name;
    int age;

    Me(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
