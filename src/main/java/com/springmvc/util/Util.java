package com.springmvc.util;
import static graphql.Scalars.GraphQLInt;
import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLOutputType;



public class Util {

public static GraphQLOutputType beanToType(Class clazz){
		
		Field fs[]=clazz.getDeclaredFields();
		List<GraphQLFieldDefinition> fieldDefinitions=new ArrayList<GraphQLFieldDefinition>();
		for(Field f:fs){
			//System.out.println(f.getType()+":"+f.getName());
			fieldDefinitions.add(treeGrammar(f.getName(),f.getType().toString()));
		}
		String clazzName = clazz.getSimpleName();
		
		return newObject()
	              .name(clazzName)
	              .fields(fieldDefinitions).build();
	}
    public static GraphQLFieldDefinition treeGrammar(String name,String type){
    
    	switch (type) {
    	
		case "int":	
			return  newFieldDefinition().name(name).type(GraphQLInt).build();
		case "class java.lang.Integer":	
			return  newFieldDefinition().name(name).type(GraphQLInt).build();
       case "class java.lang.String":
    	   return  newFieldDefinition().name(name).type(GraphQLString).build();
		default:
			//System.out.println(name+":"+type);
			return  newFieldDefinition().name(name).type(GraphQLString).build();
//			return null;
			
		}
    	
    }
}
