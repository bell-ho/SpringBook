package org.zerock.sample;

import org.aspectj.runtime.CFlow;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
//���������� �� Ŭ������ �����ϰڴٴ� ������̼�
@ToString
//toString" �޼���� ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
@Getter
@AllArgsConstructor
//@AllArgsConstructor�� �ν��Ͻ� ������ ����� ��� ���� �Ķ���ͷ� �޴� �����ڸ� �ۼ��ϰ� �˴ϴ�.
public class SampleHotel {
	private Chef chef;
	
//@AllArgsConstructor <==�̰Ŷ��� 
//	public SampleHotel(Chef chef) { <==�̰� ����� ����
//		// ������ ����� Chef ����
//		//Autowired ���� ó����
//		this.chef = chef;
// 	}
	
}
