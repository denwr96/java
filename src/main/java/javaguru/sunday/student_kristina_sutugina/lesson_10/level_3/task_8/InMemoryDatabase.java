package javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_8;


import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database {
    List<Product> list = new ArrayList<>();

    @Override
    public void save(Product product) {
        list.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for(int i=0; i< list.size(); i++) {
            if (list.get(i).getTitle()==productTitle) {
                return list.get(i);
            }
        }
        return null;
    }

}
