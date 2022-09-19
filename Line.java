public class Line {
    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    
    public static double slope(int x1, int y1, int x2, int y2) {
        return (y2 - y1)/(x2 - x1);
    }
}