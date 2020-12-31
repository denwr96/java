package javaguru.sunday.student_liana_shirmane.lesson_12.level_3;
//task18
public class NullPointerExceptionDemo {

        public static void main(String args[])
        {
            try {
                String a = null;
                System.out.println(a.charAt(0)); //не может печатать на консоль 1 символ от null
            } catch(NullPointerException e) {
                System.out.println("NullPointerException");
            }
        }
    }

