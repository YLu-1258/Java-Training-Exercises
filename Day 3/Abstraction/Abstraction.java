public class Abstraction {
    public static void main(String[] args) {
        T_Shirt Tee = new T_Shirt("Blue", 10, 20);
        Jacket Jack = new Jacket("Black", "Adidas", 40);
        System.out.println(Tee.getDescription());
        System.out.println(Jack.getDescription());
        System.out.println(Tee.price + Jack.price);
    }
}

abstract class Shirt {
    public String color;

    Shirt(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

    public abstract String getDescription();
}

class T_Shirt extends Shirt {
    int size;
    int price;

    T_Shirt(String c, int s, int p) {
        super(c);
        size = s;
        price = p;   
    }

    @Override
    public String getDescription() {
        return super.color + " " + size + " " + price;
    }
}

class Jacket extends Shirt {
    int price;
    String brand;

    Jacket(String c, String b, int p) {
        super(c);
        price = p;
        brand = b;
    }

    @Override
    public String getDescription() {
        return super.color + " " + brand + " " + price;
    }
}