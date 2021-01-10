package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_3;

// Task 18

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String nullString = null;

        try {
            nullString.hashCode(); // здесь проявляется NullPointerException, операция с неинициализированным или нулл объектом
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
