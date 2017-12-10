package kr.ac.hansung.model;


import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class Offer {

	private int year;
	
	@Size(min=2, max=10, message="Name must be between 2 and 100 chars")
	private int semester;
	
	private String course_code;
	
	@Size(min=5, max=100, message="Name must be between 2 and 100 chars")
	private String course_name;
	
	private String division;
	
	private int grade;
	
	

	
}
