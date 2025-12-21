package LLD2.DesignPatterns.CreationalType.Factory.Example1;

//Step 3: Factory class (CORE)

class ShapeFactory {

    public static Shape getShape(String type) {

        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

