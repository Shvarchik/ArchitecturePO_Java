package Homework_1.modelelements;

public class Camera {

    private Point3D location;
    private Angle3D angel;
    
    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngel() {
        return angel;
    }

    public void setAngel(Angle3D angel) {
        this.angel = angel;
    }

    public void rotate (Angle3D angle){}

    public void move (Point3D point){}
}
