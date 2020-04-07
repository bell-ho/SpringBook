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
//�׽�Ʈ �ڵ�� �켱 ���� �׽�Ʈ �ڵ尡 �������� �������� ������ �� ���̶�� ���� @Runwith������̼����� ǥ���մϴ�

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//���� �߿��� ������ @ContextConfiguration ������̼ǰ� �Ӽ����� ���ڿ� �����Դϴ�.
//@ContextConfiguration�� ������ Ŭ������ ���ڿ��� �̿��ؼ� �ʿ��� ��ü���� ������ ���� ��ü�� ����ϰ� �˴ϴ�
//(���� �������� ������ ��ϵȴٰ� ǥ���ϰ� �մϴ�) @ContextConfiguration�� �������� ���ڿ��� ��classpath:���� 'file:���� �̿��� �� �����ǷΣ� 
//��Ŭ�������� �������� ������ root-context.xml�� ��θ� ������ �� �ֽ��ϴ�. 

@Log4j
//@Log4j�� Lombok�� �̿��ؼ� �α׸� ����ϴ� Logger�� ������ �����մϴ�. 
//������ Logger ��ü�� ������ ���̵� Log4j ���̺귯���� ������ �����Ѵٸ� �ٷ� ����� ���ֽ��ϴ�.
//Spring Legacy Project�� �����ϴ� ��� �⺻���� Log4j�� �ش� ������ �Ϸ�Ǵ� �����̱� ������ ������ ó�� ���� ��밡��

public class SampleTests {
	
	@Setter(onMethod_ = { @Autowired })
	//@Autowired�� �ش� �ν��Ͻ� ������ ���������κ��� �ڵ����� ������ �޶�� ǥ���̰�
	//�������� ���������� ������ �����ϴٸ� obj ������ Restaurant Ÿ���� ��ü�� �����ϰ� �˴ϴ�.
	private Restaurant restaurant;

	@Test
	//@Test�� JUnit���� �׽�Ʈ ����� ǥ���ϴ� ������̼��Դϴ�.
	//�ش� �޼��带 �����ϰ� JUnit Test ����� �����մϴ�.
	public void testExist() {
		
		assertNotNull(restaurant);
		//assertNotNull( )�� restaurant ������ null�� �ƴϾ�߸� �׽�Ʈ�� �����Ѵٴ� ���� �ǹ��մϴ�.
		
		log.info(restaurant);
		log.info("==========");
		log.info(restaurant.getChef());
	}
}
