package javaguru.sunday.student_liana_shirmane.lesson_8.level_3;
//task13
class BankDemo {
        public static void main(String args[]){
            Bank b;
            b=new SEB();
            System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");
            b=new SWED();
            System.out.println("Rate of Interest is: "+b.getRateOfInterest()+"%");
        }
}

