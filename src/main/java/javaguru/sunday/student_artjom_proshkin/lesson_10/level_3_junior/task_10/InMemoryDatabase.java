package javaguru.sunday.student_artjom_proshkin.lesson_10.level_3_junior.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {

    List<Product> productLibrary = new ArrayList<>();

    @Override
    public void save(Product product) {
        productLibrary.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : productLibrary) {
            if (productTitle.equals(product.getTitle())) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
