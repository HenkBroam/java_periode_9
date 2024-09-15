package section1_intro.part1_language_basics;

public class GeometryAnalyser {

    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        int x2 = Integer.parseInt(args[2]);
        int y2 = Integer.parseInt(args[3]);
        String operation = args[4];

        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = x1;
        p1.y = y1;
        p2.x = x2;
        p2.y = y2;

        Rectangle rectangle = new Rectangle();
        rectangle.upperLeft = p1;
        rectangle.lowerRight = p2;

        if (operation.equals("surf")) {
            int surface = rectangle.getSurface();
            System.out.println(surface);
        } else if (operation.equals("dist")) {
            double distance = p1.euclideanDistanceTo(p2);
            System.out.printf("%.1f%n", distance);
        }

    }
}
