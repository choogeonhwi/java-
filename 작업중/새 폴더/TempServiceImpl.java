package com.lgy.project_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.project_server.dao.TempDao;
import com.lgy.project_server.dto.TempDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TempServiceImpl implements TempService {

    @Autowired
    private TempDao tempDao;
    
    @Override
    public int savePlanSchedule(String gatPlanDate, String gatPlanAddr, String gatPlanAddr2,
            String gatPlanTitle, String gatPlanDesc, String gatheringGatId) {
        log.info("@# TempServiceImpl.savePlanSchedule() start");
        
        // DTO에 데이터 설정
        TempDto tempDto = new TempDto();
        tempDto.setGAT_PLAN_DATE(gatPlanDate);
        tempDto.setGAT_PLAN_ADDR(gatPlanAddr);
        tempDto.setGAT_PLAN_ADDR_DETAIL(gatPlanAddr2);
        tempDto.setGAT_PLAN_TITLE(gatPlanTitle);
        tempDto.setGAT_PLAN_DESC(gatPlanDesc);
        tempDto.setGATHERING_GAT_ID(gatheringGatId);
        
        // DAO를 통해 데이터 저장
        int result = tempDao.savePlanSchedule(tempDto);
        
        log.info("@# TempServiceImpl.savePlanSchedule() end");
        
        return result;
    }

	@Override
	public String getGatheringLeaderId() {
		// TODO Auto-generated method stub
		return tempDao.getGatheringLeaderId();
	}
    
    
}