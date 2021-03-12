import java.math.BigDecimal;

public class Accounts {

    private BigDecimal toalMoney;

    public BigDecimal getToalMoney() {

        return toalMoney;
    }

    public void setToalMoney(BigDecimal toalMoney) {

        this.toalMoney = toalMoney;
    }

    public synchronized void saveMoney(BigDecimal money){
        System.out.println("Current Balance："+toalMoney+"Depositing..."+money);

        toalMoney =  toalMoney.add(money);

        System.out.println("Current Balance："+toalMoney+"End of deposit....");
    }

    public synchronized void takeMoney(BigDecimal money){
        System.out.println("Current Balance："+toalMoney+"Depositing..."+money);
        if(toalMoney.compareTo(money)==-1){
            System.out.println("Insufficient current balance");
            return;
        }
        toalMoney  =  toalMoney.subtract(money);
        System.out.println("The current balance is ："+toalMoney+"Withdrawal is over....");

    }




    }





