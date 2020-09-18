public class Cylinder {
    public static double getBaseArea(int radius){
        return  Math.PI * Math.pow(radius,2);
    }

    public static double getPerimeter(int radius){
        return 2 * Math.PI  * radius;
    }

    public static double getVolume(int radius, int height){
        return getPerimeter(radius) * height + 2 * getBaseArea(radius);
    }
}
