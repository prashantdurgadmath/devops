package net.prashantcd.devopsdemo.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class WelcomeControllerTest {
	@Autowired
	private WebApplicationContext context;
	private MockMvc mockmvc;

	@Before
	public void setup() throws Exception {
		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void test() throws Exception {
		mockmvc.perform(get("/")).andExpect(status().is(200));
	}

}
