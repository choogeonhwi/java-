package com.lgy.spring_15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_15.domain.MemberVO;
import com.lgy.spring_15.domain.SampleVO;
import com.lgy.spring_15.domain.TicketVO;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

//@Controller
@RestController
@RequestMapping("/Sample")
//@Log4j // 보안이슈로 사용 금지
@Slf4j
public class SampleController {
	@GetMapping(value = "/getSample")
//	@GetMapping(value = "/getSample".produces = {MediaType.APPLICATION_JSON_UTF8_VALUE
//	,MediaType.APPLICATION_XML_VALUE})
	// import org.springframework.http.mediaType;
	public SampleVO getSample() {
		return new SampleVO(112, "스타", "로드");
	}

	@GetMapping(value = "/getList")
	public List<SampleVO> getList() {
		return IntStream.range(1, 10).mapToObj(i -> new SampleVO(i, i + "First", i + "Last"))
				.collect(Collectors.toList()); // 스트림, 람다식 1.8버전부터 사용가능

	}

	@GetMapping(value = "/getMap")
	public Map<String, SampleVO> getMap() {
		Map<String, SampleVO> map = new HashMap<String, SampleVO>();
		map.put("First", new SampleVO(111, "그루트", "주니어"));

		return map;
	}

	@GetMapping(value = "/check", params = { "height", "weight" })
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		SampleVO vo = new SampleVO(0, "" + height, "" + weight);
		ResponseEntity<SampleVO> result = null;

		if (height < 150) {
			// 오류 상태
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		} else {
			// 정상 상태
			result = ResponseEntity.status(HttpStatus.OK).body(vo);

		}
		return result;
	}
	
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid")int pid) {
		return new String[] {"category : "+cat, "product id : "+pid};
	}
	
	@PostMapping("/ticket")
	public TicketVO convert(@RequestBody TicketVO ticketVO) {
//		System.out.println(ticketVO);
		log.info("asfd2"+ticketVO);
		log.debug("asfd3"+ticketVO);
		return ticketVO;
	}
	
	
	@PostMapping("/info")
	public MemberVO convert(@RequestBody MemberVO vo) {
		log.debug("1234"+vo);
		return vo;
	}
	
	
}
