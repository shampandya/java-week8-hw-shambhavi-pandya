package programme19_cylinder;

public class Cylinder extends Circle {
     double height;

     public Cylinder(double radius, double height){
         super(radius);
         this.height = height;

         if (height <= 0){
             this.height = height;
         }

     }
     public double getHeight(){
         return height;
     }
     public double getVolume(){
         return getArea() * height;
     }
}
