package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership {
    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        return getBaseRate().add(new BigDecimal("10.50"));

    }
    public void useGuestPass() {
        if (guestPasses > 0 ) {
            guestPasses--;
            System.out.println(getMemberName() + " used a guest pass. Passes left: " + guestPasses);
        }else {
            System.out.println(getMemberName() + " has no guest passes left. ");
        }
    }

    @Override
    public BigDecimal getSignUpFee() {
        if (getMonths() >= 12) {
            return new BigDecimal("0.00");
        }
        return super.getSignUpFee();
    }

    @Override
    public String toString() {
        return "Premium | " + getMemberName() + " | " + getMonths() + " months | guest passes: " + guestPasses;
    }
}
