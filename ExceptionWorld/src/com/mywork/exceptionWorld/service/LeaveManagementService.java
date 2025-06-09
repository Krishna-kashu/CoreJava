package com.mywork.exceptionWorld.service;

public class LeaveManagementService {
    private int leaveBalance = 5;
    public void applyLeave(int days) {
        try {
            if (days <= 0) {
                throw new IllegalArgumentException("Leave days must be greater than 0.");
            } else if (days > leaveBalance) {
                throw new IllegalStateException("Insufficient leave balance.");
            }

            leaveBalance -= days;
            System.out.println("Leave approved for " + days + " day(s). Remaining: " + leaveBalance);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Leave application failed: " + e.getMessage());
        }
    }
}
