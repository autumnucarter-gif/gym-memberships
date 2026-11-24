package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Gym Memebership =========");

        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.printf("%s, %d months, $%.2f per month%n",
                henry.getMemberName(), henry.getMonths(), henry.getMonthlyPrice());
    }
}
