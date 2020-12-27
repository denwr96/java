package main.java.javaguru.sunday.student_kristina_sutugina.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorArrayVersion implements  DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        if (number > 0 && number <= 7) {
            String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            for (int i = 0; i < dayName.length; i++) {
               // System.out.println(dayName[number - 1]);
                return dayName[number - 1];
            }
        } else {
            return "Please input a valid number between 1 and 7";
        }
        return null;
    }
}
