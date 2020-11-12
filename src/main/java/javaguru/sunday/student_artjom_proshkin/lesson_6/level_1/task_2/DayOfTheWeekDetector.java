package main.java.javaguru.sunday.student_artjom_proshkin.lesson_6.level_1.task_2;

class DayOfTheWeekDetector {

    String weekDay;

    String detectDayName(int number) {
        if ((number >= 1) && (number <= 7)) {
            switch (number) {
                case 1 -> weekDay = "Monday";
                case 2 -> weekDay = "Tuesday";
                case 3 -> weekDay = "Wednesday";
                case 4 -> weekDay = "Thursday";
                case 5 -> weekDay = "Friday";
                case 6 -> weekDay = "Saturday";
                case 7 -> weekDay = "Sunday";
            }
        } else {
            weekDay = "Please input a valid number between 1 and 7";
        }
        return weekDay;

    }

//    public static void main(String[] args) {
//        Scanner myInput = new Scanner(System.in);
//
//        System.out.print("Input integer number between 1 and 7 : ");
//        int firstNumber = myInput.nextInt();
//        if ((firstNumber >= 1) && (firstNumber <= 7)) {
//            switch (firstNumber) {
//                case 1 -> System.out.println("Monday");
//                case 2 -> System.out.println("Tuesday");
//                case 3 -> System.out.println("Wednesday");
//                case 4 -> System.out.println("Thursday");
//                case 5 -> System.out.println("Friday");
//                case 6 -> System.out.println("Saturday");
//                case 7 -> System.out.println("Sunday");
//            }
//        } else {
//            System.out.println("Please input a valid number between 1 and 7");
//        }
//    }
}

