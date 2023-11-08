// Define the Food interface with a describe method
interface Food {
    void describe();
}

// Class representing fruits, implementing the Food interface
class Fruit implements Food {
    // Method to describe common attributes of fruits
    public void commonAttribute() {
        System.out.println("Fruits are healthy.");
    }

    @Override
    public void describe() {
        commonAttribute();
        System.out.println("Fruits are delicious and nutritious.");
    }
}

// Class representing vegetables, inheriting from Fruit and implementing the Food interface
class Vegetable extends Fruit implements Food {
    // Method to describe specific attributes of vegetables
    public void specificAttribute() {
        System.out.println("Vegetables are typically low in calories.");
    }

    @Override
    public void describe() {
        super.describe();  // Call the describe method of the superclass (Fruit)
        specificAttribute();
        System.out.println("Vegetables come in various shapes and colors.");
    }
}

// Class representing protein sources, inheriting from Vegetable and implementing the Food interface
class ProteinSource extends Vegetable implements Food {
    // Method to describe unique attributes of protein sources
    public void uniqueAttribute() {
        System.out.println("Protein sources are essential for muscle growth.");
    }

    @Override
    public void describe() {
        super.describe();  // Call the describe method of the superclass (Vegetable)
        uniqueAttribute();
        System.out.println("Protein sources include meat, fish, and legumes.");
    }
}

// Class representing desserts, inheriting from ProteinSource and implementing the Food interface
class Dessert extends ProteinSource implements Food {
    // Method to describe indulgent attributes of desserts
    public void indulgentAttribute() {
        System.out.println("Desserts are sweet treats enjoyed on special occasions.");
    }

    @Override
    public void describe() {
        super.describe();  // Call the describe method of the superclass (ProteinSource)
        indulgentAttribute();
        System.out.println("Desserts range from cakes and pies to ice cream and pastries.");
    }
}

// Main class to execute the program
public class exampletoinh2 {
    public static void main(String[] args) {
        // Create an instance of the Dessert class and call its describe method
        Food dessert = new Dessert();
        dessert.describe();
    }
}
