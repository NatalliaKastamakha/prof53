package lesson2.bank;

public class Account {

    private String id;
    private String owner;
    private int balance;

    //dobavit konstruktory + gettery

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    // dopisać metody

    // добавление денег на счет
    // и возвращение полученного баланса
    public int debit(int money){
        if(money < 0)
        {
            System.out.println("отрицательная сумма для дебита");
        }
        else {
            balance += money;
        }
        return balance;
    }




    // удаление денег со счета
    // нельзя удалить больше чем на счете есть
    // при пытытке удалить больше, не нужно менять баланс счета, но нужно
    // печатать об этом сообщение
    // возвращается количество денег оставшихся на балансе
    public int credit(int money)
    {
        return 0;
    }

    // перевод денег со счета на счет
    // кредитуем свой счет и дебитуем account
    // возвращается баланс счета
    // при попытке снять больше чем есть на счете нужно печатать сообщение
    public int transfer(Account account, int amount)
    {
        return 0;
    }

}

