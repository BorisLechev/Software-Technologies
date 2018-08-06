import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p22IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstCircleData = scanner.nextLine().split(" ");
        String[] secondCircleData = scanner.nextLine().split(" ");

        ArrayList<Circle> arrayList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            String secondCircleDatum = secondCircleData[i];

            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int X = input[0];
            int Y = input[1];
            int Radius = input[2];

            Circle point = new Circle();

            point.setX(X);
            point.setY(Y);
            point.setRadius(Radius);

            arrayList.add(point);
        }

        String output = AreIntersect(arrayList);

        System.out.println(output);
    }

    private static String AreIntersect(ArrayList<Circle> record) {

        double distanceBetweenCenters = Math.sqrt(Math.pow(record.get(0).getX() - record.get(1).getX(), 2) +
                Math.pow(record.get(0).getY() - record.get(1).getY(), 2));

        if (record.get(0).getRadius() + record.get(1).getRadius() >= distanceBetweenCenters) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

class Circle {

    public Integer X;

    public Integer Y;

    public Integer Radius;

    public Integer getRadius() {
        return Radius;
    }

    public void setRadius(Integer radius) {
        Radius = radius;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }
}
