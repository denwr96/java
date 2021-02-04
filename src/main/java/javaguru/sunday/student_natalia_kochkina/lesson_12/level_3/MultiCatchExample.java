package javaguru.sunday.student_natalia_kochkina.lesson_12.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_20
@CodeReview(approved = true)
public class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}
//При ловле исключений мы руководствуемся принципом от частного к общему. Если мы начнем с блока
//"catch (Exception e)", который является суперклассом для ArithmeticException, то этот блок выполнится,
//а до блока с ArithmeticException мы так и не дойдем.