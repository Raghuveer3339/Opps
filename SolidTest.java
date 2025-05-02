abstract class Solid {
    abstract double calculateVolume();
}

class Cuboid extends Solid {
    double length, width, height;

    Cuboid(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    double calculateVolume() {
        return length * width * height;
    }
}

class Sphere extends Solid {
    double radius;

    Sphere(double r) {
        this.radius = r;
    }

    double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

public class SolidTest {
    public static void main(String[] args) {
        Solid cuboid = new Cuboid(4, 5, 6);
        Solid sphere = new Sphere(3);

        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
    }
}
