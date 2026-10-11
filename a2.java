abstract class Objects{
    abstract void showShape();

    public void shape(){
        System.out.println("I'm from abstract class");
    }
}

class Sphere extends Objects{
    void showShape(){
        System.out.println("I'm from abstract class");
    }
}

class cuboid extends Objects{
    void showShape(){
        System.out.println("Object type is cuboid");
    }
}

class Prism extends Objects{
    void showShape(){
        System.out.println("Object type is Prism");
    }
}

public class a2{
    public static void main(String[] args){
        Objects obj = new Sphere();
        obj.shape();
        obj.showShape();

        obj = new cuboid();
        obj.shape();
        obj.showShape();

        obj = new Prism();
        obj.shape();
        obj.showShape();


    }
}