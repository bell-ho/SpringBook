package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
//@Component�� ���������� �ش� Ŭ������ ���������� �����ؾ� ���� ������� ǥ���ϴ� ������̼��̰�. 
//@Setter�� �ڵ����� setChef( )�� ������ �Ҷ� �����մϴ�. 
public class Restaurant {

	@Setter(onMethod_= @Autowired)
	//@Setter���� ���� onMethod �Ӽ��� , �����Ǵ� setChef( )�� @Autowired ������̼��� �߰��ϵ��� �մϴ�. 
	//Lombok���� ������ Ŭ������ ���� ������ ��Ŭ������ ���ؼ� Ȯ���Ҽ��ֽ��ϴ�.
	//Restaurant �� Chef���� ���������� Autowired�� ���� �� �� �ִ�
	private Chef chef;
}
