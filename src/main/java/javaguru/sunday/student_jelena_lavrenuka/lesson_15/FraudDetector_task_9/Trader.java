package javaguru.sunday.student_jelena_lavrenuka.lesson_15.FraudDetector_task_9;

import java.util.Objects;

class Trader {
    String fullName;
    String city;

    public Trader(String name, String city) {
        this.fullName = name;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(fullName, trader.fullName) &&
                Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, city);
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
