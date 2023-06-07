package com.thanooj.demo.springboot.springbootone;

import java.io.Serial;
import java.io.Serializable;

public record Greeting(String content) implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;


}
