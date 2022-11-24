package Homework_1.modelelements;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private Float power;

    public Flash(Color color, Float power) {
        this.color = color;
        this.power = power;
    }

    public Color getColor() {
        return color;
    }

    public Float getPower() {
        return power;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public void rotate (Angle3D angle){}

    public void move (Point3D point){}

}
