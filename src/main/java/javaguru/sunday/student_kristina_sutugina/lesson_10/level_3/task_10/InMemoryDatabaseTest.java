package main.java.javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_10;

public class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.InMemoryDatabase();
    }
   public void InMemoryDatabase(){
       InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
       Product product = new Product("Milk");
       Product product1 = new Product("Cheese");
       Product product2 = new Product("Cream");
       Product product3 = new Product("Eggs");
       inMemoryDatabase.save(product);
       inMemoryDatabase.save(product1);
       inMemoryDatabase.save(product2);
       inMemoryDatabase.save(product3);

       if(inMemoryDatabase.findByTitle("Cream").get().equals(product2)){
           System.out.println("Test is Ok");
       }else{
           System.out.println("Test failed");
       }
   }
}
