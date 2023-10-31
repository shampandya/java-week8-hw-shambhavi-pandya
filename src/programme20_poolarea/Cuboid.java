package programme20_poolarea;

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double heigth) {
        super(width, length);
        this.height = heigth;

        if(heigth <= 0){
            this.height = 0;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
