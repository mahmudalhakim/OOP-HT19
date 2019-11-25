/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 14:32
 * Copyright: MIT
 */

public class BankDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Mahmud";

        Bank bankAccount = new Bank();
        bankAccount.owner = person;
        bankAccount.accountNumber = 123456;
        bankAccount.balance = 100;

        System.out.println(bankAccount.accountNumber +
                " ägs av " + bankAccount.owner.firstName
        );

    }
}
