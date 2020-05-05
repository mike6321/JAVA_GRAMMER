package me.designpattern.homework.week_01.Customer;

import me.designpattern.homework.week_01.LoginCheck;

import java.util.HashMap;
import java.util.Map;

/**
 * Project : EffectiveStudy
 * Created by InteliJ IDE
 * Developer : junwoochoi
 * Date : 2020/05/02
 * Time : 11:56 오후
 */
public class Customer {

    private static final Map<String, Customer> loginUser;

    static {
        loginUser = new HashMap<>();

        loginUser.put("dynee313", new Customer("dynee313", "dy", 0, 0, false));
        loginUser.put("imesung", new Customer("imesung", "hs", 0, 10000, false));
        loginUser.put("mike6321", new Customer("mike6321", "jw", 1, 2000, false));
        loginUser.put("leetsh", new Customer("leetsh", "sh", 2, 0, true));
    }

    private final String userId;
    private String userName;
    private int gubun;
    private long point;
    private boolean blackConsumerFlag;

    public Customer(String userId, String userName, int gubun, long point, boolean blackConsumerFlag) {
        this.userId = userId;
        this.userName = userName;
        this.gubun = gubun;
        this.point = point;
        this.blackConsumerFlag = blackConsumerFlag;
    }

    public Customer(String userId) {
        this.userId = userId;
    }

    public boolean checkCustomer(Customer customer) {
        if (loginUser.get(customer.userId) != null) {
            LoginCheck loginCheck = new LoginCheck();
            loginCheck.isTrueLogin();

            return true;
        }else {
            return false;
        }
    }

    public boolean blackConSumerCheck(String userId) {
        return loginUser.get(userId).blackConsumerFlag;
    }

    public boolean pointCheck(String userId) {

        return loginUser.get(userId).point != 0;
    }

}
