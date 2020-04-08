package org.zerock.persitence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class TimeMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		System.out.println("(timeMapper.getClass().getName())");
		log.info(timeMapper.getClass().getName());
		System.out.println("(timeMapper.getTime())");
		log.info(timeMapper.getTime());
		// 실행 결과를 보면 개발 시 인터페이스만 만들어 주었는데 
		//내부적으로 적당한 클래스가 만들어진 것을 확인할 수 있습니다
	}
}
