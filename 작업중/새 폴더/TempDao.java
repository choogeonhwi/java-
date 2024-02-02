package com.lgy.project_server.dao;

import com.lgy.project_server.dto.TempDto;

public interface TempDao {

    public int savePlanSchedule(TempDto tempDto);

	public String getGatheringLeaderId();
}
