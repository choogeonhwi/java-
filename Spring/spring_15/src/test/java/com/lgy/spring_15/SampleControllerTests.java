package com.lgy.spring_15;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;
import com.lgy.spring_15.domain.TicketVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;



@RunWith(SpringJUnit4ClassRunner.class)

@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Slf4j
public class SampleControllerTests {
		@Setter(onMethod_ = {@Autowired})
		private WebApplicationContext ctx;
		private MockMvc mockMvc;
		
		@Before
		public void setup() {
			this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
			
		}
		
		@Test
		public void testConvert() throws Exception {
			TicketVO ticketVO=new TicketVO();
			ticketVO.setTno(123);
			ticketVO.setOwner("admin");
			ticketVO.setGrade("aaa");
			String str=  new Gson().toJson(ticketVO);
			log.debug("123"+str);
			log.info("123"+str);
			
			mockMvc.perform(post("/Sample/ticket")
					.contentType(MediaType.APPLICATION_JSON)
					.content(str)
					
					
					)
			.andExpect(status().is(200));
		}
}
