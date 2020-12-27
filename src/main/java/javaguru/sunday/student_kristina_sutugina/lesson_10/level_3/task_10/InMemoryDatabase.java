package javaguru.sunday.student_kristina_sutugina.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {
    List<Product> list = new ArrayList<>();

    @Override
    public void save(Product product) {
        list.add(product);
    }


    @Override
    public Optional findByTitle(String productTitle) {
        for(int i=0; i< list.size(); i++) {
            if (list.get(i).getTitle()==productTitle) {
                return Optional.ofNullable(list.get(i));
            }
        }
        return Optional.ofNullable(null);
    }

}

