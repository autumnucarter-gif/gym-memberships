package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Gym Memebership =========");

        //Step 3 check run
        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.printf("%s, %d months, $%.2f per month%n",
                henry.getMemberName(), henry.getMonths(), henry.getMonthlyPrice());

        //Step 4 check run
        BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);

        System.out.printf("%s, %d months, $%.2f per month%n",
                alice.getMemberName(), alice.getMonths(), alice.getMonthlyPrice());
        System.out.printf("%s, %d months, $%.2f per month%n",
                bob.getMemberName(), bob.getMonths(), bob.getMonthlyPrice());
    }
}
