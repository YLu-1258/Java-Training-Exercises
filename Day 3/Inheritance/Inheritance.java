public class Inheritance {
    public static void main(String[] args) {
        Child Alex = new Child("Alex", "Lu", "Brown");
        System.out.println(Alex.getName());
        System.out.println(Alex.getEye());
    }
}

class Parent {
    public String last_name;
    public String eye_color;

    public Parent(String l, String e) {
        last_name = l;
        eye_color = e;
    }

    public String getLastName() {
        return last_name;
    }
}

class Child extends Parent {
    public String first_name;
    

    Child(String f, String last_name, String eye_color) {
        super(last_name, eye_color);
        first_name = f;
    }

    public String getName() {
        return first_name +  " " + last_name;
    }

    public String getEye() {
        return eye_color;
    } 
}