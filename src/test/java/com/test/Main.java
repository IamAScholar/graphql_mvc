package com.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static graphql.Scalars.GraphQLString;
import static graphql.Scalars.GraphQLInt;
import static graphql.schema.GraphQLObjectType.newObject;
import com.springmvc.model.CbObjectsDao;
import com.springmvc.model.CbObjectsDaoExample;
import com.springmvc.model.CbObjectsDaoExample.Criteria;
import com.springmvc.service.ObjServer;
import com.springmvc.service.impl.ObjServerImp;
import com.springmvc.util.Util;
import static graphql.schema.GraphQLArgument.newArgument;

import graphql.GraphQL;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLOutputType;
import graphql.schema.GraphQLSchema;

public class Main {

	

private ObjServer userService;
private  GraphQLOutputType obType;
private GraphQLSchema schema;
	@Before
	public void before(){       
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
				,"classpath:conf/spring-mybatis.xml"});
		userService = (ObjServerImp) context.getBean("objServerImp");
		//System.out.println(userService.selectByPrimaryKey("c:1").getCity());
		obType=Util.beanToType(CbObjectsDao.class);
		
		schema = GraphQLSchema.newSchema().query(newObject()
                .name("GraphQuery")
                .field(createUserField())
                .build()).build();
		
	}
	   private GraphQLFieldDefinition createUserField() {
		       
	        return GraphQLFieldDefinition.newFieldDefinition()
	                .name("user")
	                .argument(newArgument().name("id").type(GraphQLString).build())
	                .type(obType)
	                .dataFetcher(environment -> {
	                    // 获取查询参数
	                    String id = environment.getArgument("id");
	                    return userService.selectByPrimaryKey(id);
	                	//return null;
	                })
	                .build();
	    }
	@Test
	public void addUser(){
//		CbObjectsDaoExample user =new CbObjectsDaoExample() ;
//		//user.setName("Wetpaint");
//		//userService.selectByPrimaryKey("c:1");
//		
//		Criteria c=user.createCriteria();
////		c.andCityEqualTo("Seattle");
////		c.andIdBetween("c:1", "c:2");
//		c.andNameLike("%palantir%");
//		List<CbObjectsDao> ll = userService.selectByExample(user);
//		System.out.println(ll.size());
//		for(CbObjectsDao d:ll){
//			System.out.println(d.getName());
//		}
		
		String query2 = "{user (id:\"c:1\") {id,name} }";
		 Map<String, Object> result1 = (Map<String, Object>) new GraphQL(schema).execute(query2).getData();
		 System.out.println(result1);
		  
	}
//	public static void main(String[] args) {
//		Main m= new Main();
//		m.before();
//		m.addUser();
//	}
}
