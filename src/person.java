import java.math.BigDecimal;

public class person implements Runnable{
    private String name;


    private Accounts account;

    private BigDecimal saveMoney;

    private BigDecimal takeMoney;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Accounts getAccount() {

        return account;
    }

    public void setAccount(Accounts account) {

        this.account = account;
    }

    public BigDecimal getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(BigDecimal saveMoney) {

        this.saveMoney = saveMoney;
    }

    public BigDecimal getTakeMoney() {

        return takeMoney;
    }

    public void setTakeMoney(BigDecimal takeMoney) {

        this.takeMoney = takeMoney;
    }

    @Override
    public String toString() {
        return "person [account=" + account + ", name=" + name + ", saveMoney="
                + saveMoney + ", takeMoney=" + takeMoney + ", getAccount()="
                + getAccount() + ", getName()=" + getName()
                + ", getSaveMoney()=" + getSaveMoney() + ", getTakeMoney()="
                + getTakeMoney() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    public person(String name,Accounts accounts, BigDecimal saveMoney,
                  BigDecimal takeMoney) {
        super();
        this.name = name;
        if(accounts==null){
            account = new Accounts();
            account.setToalMoney(BigDecimal.valueOf(0));
        }else {
            account= accounts;
        }
        this.saveMoney = saveMoney;
        this.takeMoney = takeMoney;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Deposit operation in progress......");
        if(null!=saveMoney&&!"".equals(saveMoney)){
            account.saveMoney(saveMoney);
        }
        if(null!=takeMoney&&!"".equals(takeMoney)){
            account.takeMoney(takeMoney);
        }

    }

}
