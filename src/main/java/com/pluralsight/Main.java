package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Gym Memebership =========");

        //Step 2 check run
        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.printf("%s, %d months, $%.2f per month%n",
                henry.getMemberName(), henry.getMonths(), henry.getMonthlyPrice());

        //Step 3 check run
        BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);

        System.out.printf("%s, %d months, $%.2f per month%n",
                alice.getMemberName(), alice.getMonths(), alice.getMonthlyPrice());
        System.out.printf("%s, %d months, $%.2f per month%n",
                bob.getMemberName(), bob.getMonths(), bob.getMonthlyPrice());

        //Step 4 check run
        PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
        PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);

        System.out.printf("%s, %d months, $%.2f per month%n",
                carol.getMemberName(), carol.getMonths(), carol.getMonthlyPrice());
        System.out.printf("%s, %d months, $%.2f per month%n",
                frank.getMemberName(), frank.getMonths(), frank.getMonthlyPrice());


        System.out.println("======== Guest Passes ========");
        carol.useGuestPass();
        carol.useGuestPass();
        carol.useGuestPass();
        frank.useGuestPass();


        //Step 5 check run
        FamilyMembership grace = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3);
        FamilyMembership emma = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1);

        System.out.printf("%s, %d months, $%.2f per month%n",
                grace.getMemberName(), grace.getMonths(), grace.getMonthlyPrice());
        System.out.printf("%s, %d months, $%.2f per month%n",
                emma.getMemberName(), emma.getMonths(), emma.getMonthlyPrice());

    }
}
