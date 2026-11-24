package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Gym Membership ====");

        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(new Membership("Henry Clark", 3, new BigDecimal("30.00")));
        memberships.add(new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true));
        memberships.add(new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false));
        memberships.add(new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2));
        memberships.add(new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0));
        memberships.add(new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3));
        memberships.add(new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1));

        BigDecimal monthlyIncome = BigDecimal.ZERO;
        BigDecimal allContracts = BigDecimal.ZERO;

        for (Membership m : memberships) {
            System.out.println(m);
            printCosts(m);
            monthlyIncome = monthlyIncome.add(m.getMonthlyPrice());
            allContracts = allContracts.add(m.getContractTotal());
        }

        System.out.println("--- Totals ---");
        System.out.println("Memberships: " + memberships.size());
        System.out.printf("Monthly income: $%.2f%n", monthlyIncome);
        System.out.printf("All contracts: $%.2f%n", allContracts);

        System.out.println("--- Front desk notes ---");
        for (Membership m : memberships) {
            if (m instanceof BasicMembership) {
                BasicMembership basic = (BasicMembership) m;
                if (basic.isOffPeakOnly()) {
                    System.out.println(basic.getMemberName() + ": entry between 10:00 and 16:00 only");
                }
            } else if (m instanceof PremiumMembership) {
                PremiumMembership premium = (PremiumMembership) m;
                premium.useGuestPass();
            } else if (m instanceof FamilyMembership) {
                FamilyMembership family = (FamilyMembership) m;
                int keyCards = 1 + family.getExtraMembers();
                System.out.println(family.getMemberName() + ": print " + keyCards + " key cards");
            }
        }
    }

    public static void printCosts(Membership membership) {
        System.out.printf("  Monthly price: $%.2f, sign-up fee: $%.2f, contract total: $%.2f%n",
                membership.getMonthlyPrice(),
                membership.getSignUpFee(),
                membership.getContractTotal());


    }
}
