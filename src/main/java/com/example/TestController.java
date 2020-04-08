package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TestController {

	@GetMapping("/test")
	public String getPersonAttendList(@Valid SampleVO vo) {
		return vo.toString();
	}
}
