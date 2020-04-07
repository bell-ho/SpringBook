package org.zerock.sample;

import org.aspectj.runtime.CFlow;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
//스프링에서 이 클래스를 관리하겠다는 어노테이션
@ToString
//toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
@Getter
@AllArgsConstructor
//@AllArgsConstructor는 인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자를 작성하게 됩니다.
public class SampleHotel {
	private Chef chef;
	
//@AllArgsConstructor <==이거때매 
//	public SampleHotel(Chef chef) { <==이게 만들어 진것
//		// 생성자 선언과 Chef 주입
//		//Autowired 없이 처리중
//		this.chef = chef;
// 	}
	
}
