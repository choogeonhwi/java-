package com.lgy.project_server.service;

public interface TempService {

    public int savePlanSchedule(String gatPlanDate, String gatPlanAddr, String gatPlanAddr2,
            String gatPlanTitle, String gatPlanDesc, String gatheringGatId);
    
    public String getGatheringLeaderId();
}