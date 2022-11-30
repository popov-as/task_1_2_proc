import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float side = readSquareSide();

        float areaOfPicture1 = getAreaOfPicture1(side);
        float areaOfPicture2 = getAreaOfPicture2(side);
        float areaOfPicture3 = getAreaOfPicture3(side);

        printArea("1", areaOfPicture1);
        printArea("2", areaOfPicture2);
        printArea("3", areaOfPicture3);
    }

    private static float getCircleArea(float radius)
    {
        return (float) Math.PI * radius * radius;
    }

    private static float getSquareArea(float side)
    {
        return side * side;
    }

    private static float getAreaOfPicture1(float side)
    {
        float squareArea = getSquareArea(side);
        float radius = side / 2;
        float circleArea = getCircleArea(radius);

        return (squareArea - circleArea) / 2;
    }

    private static float getAreaOfPicture2(float side)
    {
        float squareArea = getSquareArea(side);
        float radius = side / 2;
        float circleArea = getCircleArea(radius);

        return circleArea + (squareArea - circleArea) / 2;
    }

    private static float getAreaOfPicture3(float side)
    {
        float squareArea = getSquareArea(side);
        float radius = side / 2;
        float circleArea = getCircleArea(radius);

        return squareArea / 4 + (squareArea - circleArea) / 4;
    }

    private static float readSquareSide()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину стороны квадрата:");
        float side = scanner.nextFloat();

        if (side <= 0) throw new IllegalArgumentException("Длина должна быть больше нуля");

        return side;
    }

    private static void printArea(String pictureName, float area)
    {
        System.out.printf("Высота фигуры на рис. %s: %.3f\n", pictureName, area);
    }
}