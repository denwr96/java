package javaguru.sunday.student_nataliya_sinitsa.lesson8.level6task30;

import javaguru.sunday.teacher.annotations.CodeReview;

/*VarArgs переводится как Variable Arguments List - "список аргументов переменной длины",
или "список переменной длины, в которой лежат аргументы"*/
@CodeReview(approved = true)
class VarArgExample {

    public static void main(String[] args) {
        VarArgExample.getNamesOfChildren("August", "Leonard", "Alfred", "Wolf");
        VarArgExample.getNamesOfChildren("Gustav",  "Frey", "Lau");
    }

    public static void getNamesOfChildren(String parentName, String... childName) {
        System.out.println(parentName + " children are:");
        for (String name : childName) {
            System.out.println(name);
        }
    }

}
