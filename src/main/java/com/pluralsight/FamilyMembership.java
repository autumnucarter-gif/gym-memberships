package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FamilyMembership extends Membership {
    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal extraCharge = new BigDecimal("12.50").multiply(BigDecimal.valueOf(extraMembers));
        BigDecimal total = getBaseRate().add(extraCharge);

        if (extraMembers >= 3) {
            total = total.multiply(new BigDecimal("0.90").setScale(2, RoundingMode.HALF_UP));
        }
        return total;
    }

    @Override
    public String toString() {
        return "Family | " + getMemberName() + " | " + getMonths() + " months | extra members: " + extraMembers;
    }
}
