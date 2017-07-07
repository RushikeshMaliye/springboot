/**
 * 
 */
package com.smile;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rushikeshM
 *
 */
@RestController
public class FirstController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring Boot";
	}
	

}
