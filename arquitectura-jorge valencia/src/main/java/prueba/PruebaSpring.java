package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BeanJorge;
//import beans.BeanSpring;

public class PruebaSpring {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanFactory factory = context;
		//BeanSpring miBean = (BeanSpring) factory.getBean("miBean");
		/*System.out.println("Mensaje: " + miBean.getMensaje());*/
		BeanJorge miBean = (BeanJorge) factory.getBean("miBean");
		miBean.setSuma();
		System.out.println("La suma es "+miBean.getX()+" + "+miBean.getY()+" = " + miBean.getSuma());
	}

}
