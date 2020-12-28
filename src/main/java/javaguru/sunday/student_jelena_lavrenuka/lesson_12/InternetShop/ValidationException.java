package javaguru.sunday.student_jelena_lavrenuka.lesson_12.InternetShop;

import java.util.Objects;

class ValidationException extends Exception {

    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String message, String ruleName, String description, String fieldName) {
        super(message);
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException exception = (ValidationException) o;
        return ruleName.equals(exception.ruleName) &&
                description.equals(exception.description) &&
                fieldName.equals(exception.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }
}
