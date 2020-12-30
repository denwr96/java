package javaguru.sunday.student_liana_shirmane.lesson_12.level_6;
//task28
//task29

import java.util.Objects;

class Product {
    private String title;
    private Integer price;
    private String description;

    Product(String title, Integer price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
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
        return Objects.equals(title, product.title) &&
                Objects.equals(price, product.price) &&
                Objects.equals(description, product.description);
    }

    @Override
    public String toString() {
        return "Product {" +
                "title ='" + title + '\'' +
                ", price ='" + price + '\'' +
                ", description ='" + description + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

}
