package demo;

import com.hhn.pojo.AccountUser;

import java.math.BigDecimal;

/**
 * Created by panrui on 2015/1/7.
 */
public class Top {
    public AccountUser testMethod(AccountUser accountUser) {
        System.out.println("修改前\t"+accountUser.getUser_id());
//        accountUser=new AccountUser(); //改变引用
        accountUser.setUser_id(100);
        System.out.println("修改后\t"+accountUser.getUser_id());
        return accountUser;
    }

    public BigDecimal testBigDecimal(BigDecimal b1) {
        System.out.println("修改前\t"+b1);
        b1 = new BigDecimal(100);
        System.out.println("修改后\t"+b1);
        return b1;
    }

    public static void main(String[] args) {
        Top top = new Top();
        AccountUser accountUser = new AccountUser();
        accountUser.setUser_id(1);
        System.out.println("main中新建\t" + accountUser.getUser_id());
        System.out.println("main中返回\t"+top.testMethod(accountUser).getUser_id());
        System.out.println("调用方法修改后返回\t"+accountUser.getUser_id());
        System.out.println("=================================================");
        BigDecimal b1 = new BigDecimal(1);
        System.out.println("main中新建\t"+b1);
        System.out.println("main中返回\t" + top.testBigDecimal(b1));
        System.out.println("调用方法修改后返回\t"+b1);
    }
}
