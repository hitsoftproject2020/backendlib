package com.neusoft.oa.aop;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neusoft.oa.ht.mapper.ICustomerMapper;

@Component
@Aspect
public class ServiceAdvice {
	
	@Autowired
	private SqlSessionFactory ssf=null;
	
	
//	//方法前的Advice
//	@Before(value="execution(* com.neusoft.oa.hr.service.impl.*.*(..))")
//	public void methodBefore(JoinPoint jp) throws Exception{
//		System.out.println("方法前切面运行了。。。");
//	}
//	
//	//方法后的Advice
//	@After(value="execution(* com.neusoft.oa.hr.service.impl.*.*(..))")
//	public void methodAfter() throws Exception{
//		System.out.println("方法后切面运行了。。。");
//	}
//	
//	//方法返回后Advice
//	@AfterReturning(value="execution(* com.neusoft.oa.hr.service.impl.*.*(..))",returning="result")
//	public void methodAfterReturningResult(Object result) throws Exception{
//		if(result instanceof List<?>) {
//			System.out.println("返回结果是List，包含元素个数是："+ ((List)result).size());
//		}
//		else {
//			
//		}
//	}
//	
	//方法抛出异常后处理Advice
	@AfterThrowing(value="execution(* com.neusoft.oa.hr.service.impl.*.*(..))",throwing="ex")
	public void methodAfterThrowException(JoinPoint jp,Exception ex) throws Exception{
		String className=jp.getTarget().getClass().getName();
		String method=jp.getSignature().getName();
		System.out.println(className+"类"+method+"方法出现异常了，异常原因:"+ex.getMessage());
	}
	
	//环绕Advice
	@Around(value="execution(* com.neusoft.oa.hr.service.impl.*.*(..))")
	public Object methodAround(ProceedingJoinPoint pjp) throws Throwable{
		
		//方法前代码区
		System.out.println("环绕前。。。。。。");
		//打开一个新的Session
		SqlSession session = ssf.openSession();
		//取得DAO接口的对象
		IEmployeeDao employeeDao=session.getMapper(IEmployeeDao.class);
		ICustomerMapper 
		if(pjp.getTarget() instanceof EmployeeServiceImplWithMyBatis) {
			((EmployeeServiceImplWithMyBatis)pjp.getTarget()).setEmployeeDao(employeeDao);
		}
				
		Object result=pjp.proceed(); //调用拦截对象
		//方法后代码区
		//提交事务
		session.commit();
		session.close();
		System.out.println("环绕后。。。。。。");
		
		return result;
		
	}

}
