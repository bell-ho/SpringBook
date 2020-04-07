package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//테스트 코드는 우선 현재 테스트 코드가 스프링을 설행히는 역할을 할 것이라는 것을 @Runwith어노태이션으로 표시합니다

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//가장 중요한 설정은 @ContextConfiguration 어노테이션과 속성값인 문자열 설정입니다.
//@ContextConfiguration은 지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체로 등록하게 됩니다
//(흔히 스프링의 빈으로 등록된다고 표현하곤 합니다) @ContextConfiguration에 사용용히는 문자열은 ’classpath:’나 'file:’을 이용할 수 있으므로， 
//이클립스에서 지동으로 생성된 root-context.xml의 경로를 지정할 수 있습니다. 

@Log4j
//@Log4j는 Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성합니다. 
//별도의 Logger 객체의 선언이 없이도 Log4j 라이브러리와 설정이 존재한다면 바로 사용할 수있습니다.
//Spring Legacy Project로 생성하는 경우 기본으로 Log4j와 해당 설정이 완료되는 상태이기 때문에 별도의 처리 없이 사용가능

public class SampleTests {
	
	@Setter(onMethod_ = { @Autowired })
	//@Autowired는 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시이고，
	//스프링은 정상적으로 주입이 가능하다면 obj 변수에 Restaurant 타입의 객체를 주입하게 됩니다.
	private Restaurant restaurant;

	@Test
	//@Test는 JUnit에서 테스트 대상을 표시하는 어노테이션입니다.
	//해당 메서드를 선택하고 JUnit Test 기능을 실행합니다.
	public void testExist() {
		
		assertNotNull(restaurant);
		//assertNotNull( )은 restaurant 변수가 null이 아니어야만 테스트가 성공한다는 것을 의미합니다.
		
		log.info(restaurant);
		log.info("==========");
		log.info(restaurant.getChef());
	}
}
