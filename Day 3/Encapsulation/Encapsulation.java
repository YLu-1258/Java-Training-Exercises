public class Encapsulation {
    public static void main(String[] args) {
        Information person1 = new Information();
        Information person2 = new Information();
        person1.setName("Alex"); person1.setAge(15); person1.setGender("Male");
        person2.setName("Anna"); person2.setAge(23); person2.setGender("Female");
        System.out.println(person1.getName() + " " + person1.getGender());
        System.out.println(person2.getName() + " " + person2.getGender());
        System.out.println("Is " + person1.getName() + " " + "Above 21? " + person1.isOfAge());
        System.out.println("Is " + person2.getName() + " " + "Above 21? " + person2.isOfAge());
    }
}

class Information {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setGender(String g) {
        this.gender = g;
    }

    public boolean isOfAge() {
        if (this.age > 21) {
            return true;
        }
        return false;
    }
}