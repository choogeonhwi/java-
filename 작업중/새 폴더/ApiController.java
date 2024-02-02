package com.lgy.project_server.controller;
import java.io.IOException;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lgy.project_server.dto.TempDto;
import com.lgy.project_server.service.TempService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class ApiController {

    @Autowired
    private TempService tempService;
    
    @ResponseBody
    @RequestMapping(value="/api")
    public ResponseEntity<HashMap<String, String>> api() {
        log.info("@# api1 start");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("data", "Hello ~~ React");
        map.put("name", "Ji Wan");
        map.put("age", "25");
        map.put("loc", "Kimhae");
        log.info("@# api1 end");
        
        return new ResponseEntity<HashMap<String,String>>(map,HttpStatus.OK);
    }
    
    @ResponseBody
    @RequestMapping(value="/api/PlanSchedule", method = RequestMethod.GET)
    public int api4(HttpServletRequest req, @RequestParam Map<String, String> formData) {
        log.info("@# api4 start");
        
        String gatPlanDate = formData.get("GAT_PLAN_DATE");
        String gatPlanAddr = formData.get("GAT_PLAN_ADDR");
        String gatPlanAddr2 = formData.get("GAT_PLAN_ADDR_DETAIL");
        String gatPlanTitle = formData.get("GAT_PLAN_TITLE");
        String gatPlanDesc = formData.get("GAT_PLAN_DESC");
        String gatheringGatId = formData.get("GATHERING_GAT_ID");
        
        
        System.out.println(gatPlanDate);
        System.out.println(gatPlanAddr);
        System.out.println(gatPlanAddr2);
        System.out.println(gatPlanTitle);
        System.out.println(gatPlanDesc);
        System.out.println(gatheringGatId);
        
        int result = tempService.savePlanSchedule(gatPlanDate, gatPlanAddr, gatPlanAddr2, gatPlanTitle, gatPlanDesc, gatheringGatId);
        
        log.info("@# api4 end");
        
        return result;
    }
    
    @RequestMapping(value = "/api/gathering/leaderId", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<?> getGatheringLeaderId() {
        try {
            // 서비스를 통해 일정을 주도하는 사람의 ID를 가져옴
            String gatheringLeaderId = tempService.getGatheringLeaderId();
            // String 값을 ResponseEntity로 감싸서 반환
            return new ResponseEntity<>(Collections.singletonMap("gatheringLeaderId", gatheringLeaderId), HttpStatus.OK);

        } catch (Exception e) {
            log.error("Failed to fetch gathering leader ID", e);
            return new ResponseEntity<>(Collections.singletonMap("error", "Failed to fetch gathering leader ID"), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }



}