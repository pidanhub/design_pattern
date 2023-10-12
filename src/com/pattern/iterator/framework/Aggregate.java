package com.pattern.iterator.framework;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 13:31
 */
@FunctionalInterface
public interface Aggregate<T> {
	Iterator<T> iterator ();
}
