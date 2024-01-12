package com.lgy.spring_test_item;

import java.sql.Timestamp;

import com.lgy.spring_test_item.ItemDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemDto {
	
	private String bname;
	private int bp;
	private String bcontent;


}
