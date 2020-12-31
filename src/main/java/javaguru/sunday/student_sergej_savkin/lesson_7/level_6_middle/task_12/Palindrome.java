package javaguru.sunday.student_sergej_savkin.lesson_7.level_6_middle.task_12;

class Palindrome {

   public String putTextToLowerCase(String text) {
       text = text.toLowerCase();
       return text;
   }

   public String removeAllSymbols(String text){
       text = text.replaceAll("[\\s+.,\"=!;-]", "");
       return text;
   }

   public char[] makeCharArray(String text) {
       char[] charArray = text.toCharArray();
       return charArray;
   }

   boolean isPalindrome(String text) {
       putTextToLowerCase(text);
       removeAllSymbols(text);
       makeCharArray(text);
       for (int i = 0; i < makeCharArray(text).length / 2; i++) {
           if (makeCharArray(text)[i] == makeCharArray(text)[makeCharArray(text).length - i -1]) {
               return true;
           }
       }
       return false;
   }

}
