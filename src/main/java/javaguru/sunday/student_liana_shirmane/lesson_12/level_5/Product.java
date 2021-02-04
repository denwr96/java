package javaguru.sunday.student_liana_shirmane.lesson_12.level_5;
//task28
//task29

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Objects;
@CodeReview(approved = true)
class Product {
    private String name;
    private Integer price;
    private String description;

    Product(String name, Integer price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(description, product.description);
    }

    @Override
    public String toString() {
        return "Product {" +
                "Name ='" + name + '\'' +
                ", Price ='" + price + '\'' +
                ", Description ='" + description + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description);
    }

}
