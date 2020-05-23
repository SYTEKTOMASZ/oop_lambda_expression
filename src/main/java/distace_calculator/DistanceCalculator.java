package distace_calculator;

public class DistanceCalculator {

    public double distance(Point p1, Point p2){
        if (p1.getClass().getSimpleName().equals(p2.getClass().getSimpleName())){
            if(p1.getClass().getSimpleName().equals("Point")){
                return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)
                        +Math.pow(p2.getY()-p1.getY(),2));
            }
            else{
                return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2) +
                        Math.pow(p2.getY()-p1.getY(),2) +
                        Math.pow(((Point3D)p2).getZ() - ((Point3D) p1).getZ(),2));
            }
        }
        else{
            return -1;
        }

}
    public static void main(String[] args) {

        Point p1 = new Point(2, 2);
        Point p2 = new Point();
        Point3D p3 = new Point3D(3, 4, 2);
        Point3D p4 = new Point3D();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        DistanceCalculator dc = new DistanceCalculator();
        System.out.println(dc.distance(new Point(2,3), new Point(0,11)));
        System.out.println(dc.distance(new Point3D(0,0,0), new Point(2,3)));
    }



}
