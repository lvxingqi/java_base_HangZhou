package com.lzlgdx.day0814;
/**银联接口，主要用于描述银联统一制定的规则
 * @author 20141*/
public interface UnionPay {
    /**查看余额*/
    double getBalance();

   /**取钱*/
   boolean drawMoney(double number);

   //检查密码
    boolean checkPwd(String input);
}

//工商银行接口：用于描述工商银行发行的卡片功能，在满足银联的规则基础上，添加自己特有的功能
interface ICBC extends UnionPay{
    //ICBC继承了父接口提供的功能
    //添加一个自己特有的功能
    void payOnline(double number);
}
//农业银行接口：用于描述中国农业银行发行卡片的功能
interface ABC extends UnionPay{
    //ABC继承了父接口提供的功能
    //添加一个自己特有的功能：支付电话费的功能
    boolean payTelBill(String phoneNum,double num);
}

//工商银行接口的实现类，用于描述工商银行发行卡的具体功能
class ICBCImpl implements ICBC{
    @Override
    public String toString() {
        return "ICBCImpl{" +
                "money=" + money +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    private double money;//工商银行卡的余额
    private String pwd; //工商银行卡的密码

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ICBCImpl() {
    }

    public ICBCImpl(double money, String pwd) {
        this.money = money;
        this.pwd = pwd;
    }

    @Override
    public double getBalance() {
        return money;
    }

    @Override
    public boolean drawMoney(double number) {
        if (number<=money){
            money-=number;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean checkPwd(String input) {
        return input.equals(pwd);
    }

    @Override
    public void payOnline(double number) {
        if (number<=money){
            System.out.println("支付成功"+number);
        }else {
            System.out.println("余额不足！");
        }
    }
}
