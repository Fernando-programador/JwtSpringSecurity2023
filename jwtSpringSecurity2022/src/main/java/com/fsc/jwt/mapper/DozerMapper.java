package com.fsc.jwt.mapper;

import java.util.ArrayList;
import java.util.List;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {
	
	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
	
	public static<O, D> D parseObject(O origin, Class<D> detination) {
		return mapper.map(origin, detination);
	}

	
	public static <O, D> List<D> parseListObject(List<O> origin, Class<D> destination){
		
		List<D> destinationObjects = new ArrayList<>();
		for (O o : origin) {
			destinationObjects.add(mapper.map(o, destination));
			
		}
		return destinationObjects;
	}
}
