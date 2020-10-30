package main.java.javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class TreeDemo {
     public static void main(String[] args) {

         Tree myTree = new Tree("Oak", 100);
         myTree.isConifer();
         System.out.println(myTree.species + " grows: " + myTree.longevity + " years. The tree is conifer = " + myTree.conifer + ".");

         Tree myTree2 = new Tree("Pine tree", 58);
         System.out.println(myTree2.species + " grows: " + myTree2.longevity + " years. The tree is conifer = " + myTree2.conifer + ".");
     }
 }
