package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
//@Component는 스프링에게 해당 클래스가 스프링에서 관리해야 히는 대상임을 표시하는 어노테이션이고. 
//@Setter는 자동으로 setChef( )를 컴파일 할때 생성합니다. 
public class Restaurant {

	@Setter(onMethod_= @Autowired)
	//@Setter에서 사용된 onMethod 속성은 , 생성되는 setChef( )에 @Autowired 어노테이션을 추가하도록 합니다. 
	//Lombok으로 생성된 클래스에 대한 정보는 이클립스를 통해서 확인할수있습니다.
	//Restaurant 은 Chef에게 의존적임을 Autowired를 통해 알 수 있다
	private Chef chef;
}
