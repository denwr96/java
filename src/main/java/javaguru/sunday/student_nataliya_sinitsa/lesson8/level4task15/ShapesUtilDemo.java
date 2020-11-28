package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level4task15;

class ShapesUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Random circle area is: " + circleArea);
        System.out.println("Random circle perimeter is: " + circlePerimeter);
//        double circleAreaExpected = Math.round((circlePerimeter * circlePerimeter / 4 / Math.PI) * 100.00) / 100.00;
//        boolean test = Math.round(circleArea * 100.00) / 100.00 == circleAreaExpected;
//        System.out.println(test);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Random square area is: " + squareArea);
        System.out.println("Random square perimeter is: " + squarePerimeter);
//        double squareAreaExpected = Math.round((squarePerimeter * squarePerimeter / 16) * 100.00) / 100.00;
//        boolean test = Math.round(squareArea * 100.00) / 100.00 == squareAreaExpected;
//        System.out.println(test);

        Shape rectangle  = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Random rectangle area is: " + rectangleArea);
        System.out.println("Random rectangle perimeter is: " + rectanglePerimeter);

        Shape triangle  = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Random triangle area is: " + triangleArea);
        System.out.println("Random triangle perimeter is: " + trianglePerimeter);
//        double triangleAreaExpected = Math.round((trianglePerimeter * trianglePerimeter * Math.sqrt(3) / 9 / 4)
//                                        * 100.00) / 100.00;
//        boolean test = Math.round(triangleArea * 100.00) / 100.00 == triangleAreaExpected;
//        System.out.println(test);
    }

}
