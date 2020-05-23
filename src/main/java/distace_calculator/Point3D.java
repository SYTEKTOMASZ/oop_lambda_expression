package distace_calculator;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        super();
        this.z = 0;

    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void incrementZ(){
        this.z++;
    }

    public void decrementZ(){
        this.z--;
    }
    @Override
    public String toString(){
        return "Point[" +super.getX()+ "," +super.getY()+ "," +z+ "]";

    }

}
