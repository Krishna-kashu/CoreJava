package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.service.LeaveManagementService;

public class LeaveManagementRunner
{
    public static void main(String[] args) {
        LeaveManagementService leaveManagementService = new LeaveManagementService();
        leaveManagementService.applyLeave(5);
    }
}
