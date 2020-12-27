package javaguru.sunday.teacher.lesson_12.lessoncode.level_6_middle;

import java.util.Optional;

public class BankService {

    public Optional<String> getClient(String clientName, Integer securityToken) {
        if (securityToken != 123) {
            SecurityTokenInvalidException exception = new SecurityTokenInvalidException("Invalid Token", securityToken);
            throw exception;
        } else if ("Alex".equals(clientName)) {
            return Optional.of("Alex");
        } else {
            return Optional.empty(); //""
        }
    }

    public static void main(String[] args) {
        BankService bankService = new BankService();
        Optional<String> result = null;
        try {
            result = bankService.getClient("Alex", 222);
        } catch (SecurityTokenInvalidException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSecurityToken());
        } catch (RuntimeException e) {
            System.out.println("Something went wrong");
        } catch (Throwable e) {
            System.out.println("WOW! A Throwable here!");
        }

        if (result != null) {
            System.out.println(result.get());
        }
    }
}
