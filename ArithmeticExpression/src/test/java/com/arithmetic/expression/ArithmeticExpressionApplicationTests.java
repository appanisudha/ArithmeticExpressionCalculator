package com.arithmetic.expression;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.arithmetic.expression.model.DataResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ArithmeticExpressionApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@LocalServerPort
	private int port;
     
    @Test
    public void testGetAllExpressionListSuccess() throws URISyntaxException {
    	
    	RestTemplate restTemplate = new RestTemplate();
        
        final String baseUrl = "http://localhost:" + port +"/calculations";
        URI uri = new URI(baseUrl);
     
        ResponseEntity<DataResponse> result = restTemplate.getForEntity(uri, DataResponse.class);
         
        //Verify request succeed
        Assert.assertEquals(200, result.getStatusCodeValue());
 
    }  
    
}
