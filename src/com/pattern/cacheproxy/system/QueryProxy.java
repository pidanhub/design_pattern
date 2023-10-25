package com.pattern.cacheproxy.system;

import java.util.HashMap;
import java.util.Map;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 21:21
 */
public class QueryProxy {
	
	private final Map<String, Double> cache = new HashMap<>();
	private final Mapper mapper = Mapper.INSTANCE;
	
	private QueryProxy () {
	}
	
	public static QueryProxy getInstance () {
		return QueryProxyHolder.queryProxy;
	}
	
	public Double queryProxy (String goodName) {
		if (cache.containsKey(goodName))
			return cache.get(goodName);
		else {
			Double query = mapper.query();
			cache.put(goodName, query);
			return query;
		}
	}
	
	private static class QueryProxyHolder {
		private static final QueryProxy queryProxy = new QueryProxy();
	}
}
