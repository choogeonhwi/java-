package com.lgy.project_server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TempDto {

    private String GAT_PLAN_DATE;
    private String GAT_PLAN_ADDR;
    private String GAT_PLAN_ADDR_DETAIL;
    private String GAT_PLAN_TITLE;
    private String GAT_PLAN_DESC;
    private String GATHERING_GAT_ID;
}
