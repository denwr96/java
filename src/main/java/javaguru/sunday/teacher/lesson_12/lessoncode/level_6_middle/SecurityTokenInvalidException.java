package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

public class SecurityTokenInvalidException extends RuntimeException {

    public Integer securityToken;

    public SecurityTokenInvalidException(String message, Integer securityToken) {
        super(message);
        this.securityToken = securityToken;
    }

    public Integer getSecurityToken() {
        return securityToken;
    }
}
