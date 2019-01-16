package cn.nextop.gadget.etcd.support.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;

/**
 * 
 * @author Jingqi Xu
 */
@SuppressWarnings("unchecked")
public class Lists {
	
	/**
	 * 
	 */
	public static <T> List<T> emptyList() {
		return (List<T>)EMPTY_LIST;
	}
	
	public static int size(final List<?> v) {
		return (v == null) ? 0 : v.size();
	}
	
	public static void clear (List<?> list) {
		if(list != null) { list.clear(); }
	}
	
	public static boolean isEmpty (final List<?> values) {
		return values == null || values.isEmpty();
	}
	
	public static <T> List<T> nullToEmpty (List<T> list) {
		return list != null ? list : emptyList();
	}
	
	public static <T> Iterable<T> iterable(List<T> list) {
		return isEmpty(list) ? emptyList() : list;
	}
	
	public static <T> List<T> fill (final int size, T t) {
		final List<T> r = new ArrayList<>(size);
		for (int i = 0; i < size; i++) r.add(t); return r;
	}
	
	public static <T> List<T> trim (List<T> v, int size) {
		final int n = size(v); if(n <= size) { return v; }
		for (int i = (n - 1); i >= size; i--) v.remove(i);
		return v;
	}
	
	public static <T> List<T> toList (final T... values) {
		if (values == null) { return new ArrayList<>(0); }
		final List<T> r = new ArrayList<T>(values.length);
		for (T value : values) { r.add(value); } return r;
	}
	
	/**
	 * 
	 */
	public static <T> List<T> toList(final T value) {
		final List<T> r = new ArrayList<T> (1); add(r, value); return r;
	}
	
	public static <T> List<T> toList(final Collection<? extends T> vs) {
		return (vs == null) ? new ArrayList<> (0) : new ArrayList<>(vs);
	}
	
	public static final <T> List<T> toList(final Iterator<T> iterator) {
		List<T> r = new ArrayList<T>(); if((iterator == null)) return r;
		while (iterator.hasNext()) { r.add(iterator.next()); } return r;
	}
	
	/**
	 * 
	 */
	public static <T> boolean add(final List<T> list, final T v) {
		if(list != null && v != null) { return list.add(v); } else return false;
	}
	
	public static final <T> T get(final List<T> value, final int index) {
		return value == null || index >= value.size() ? null : value.get(index);
	}
	
	public static final <T> List<T> dels(Collection<T> a, Collection<T> b) {
		List<T> r = new ArrayList<>(a); if (b != null) r.removeAll(b); return r;
	}
	
	public static <T> List<T> adds(List<? extends T> v1, List<? extends T> v2) {
		final List<T> r = toList(v1); if(v2 != null) { r.addAll(v2); } return r;
	}
	
	/**
	 * 
	 */
	public static <T> List<T> reverse(final List<T> list) {
		if(list == null) return null; java.util.Collections.reverse(list); return list;
	}
	
	public static <T extends Comparable<? super T>> List<T> sort (List<T> list) {
		if(list == null) return null; java.util.Collections.sort ((list)); return list;
	}
	
	public static <T> List<T> sort(final List<T> list, Comparator<? super T> c) {
		if(list == null) return null; java.util.Collections.sort(list, c); return list;
	}
}
