package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_3;

// Task 20

class MultiCatchExample {

    public static void main(String[] args) {

        try {
            System.out.println(1/0);

        } catch(ArithmeticException a) {
            System.out.println(a.getMessage());

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        // Блок catch(Exception e) уловит ArithmeticException в любом случае
    }
}
