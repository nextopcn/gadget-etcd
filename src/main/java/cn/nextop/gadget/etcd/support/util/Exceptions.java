package cn.nextop.gadget.etcd.support.util;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * 
 * @author Jingqi Xu
 */
public final class Exceptions {
	
	/**
	 * 
	 */
	protected static final Throwable root(final Throwable tx) {
		Throwable r = ExceptionUtils.getRootCause(tx); return r == null ? tx : r;
	}
	
	public static final Throwable getRootCause(final Throwable tx) {
		if(tx == null) return null; final Throwable root = root(tx); return root;
	}
	
	public static final String getRootMessage(final Throwable tx) {
		if(tx == null) return null; Throwable r = root(tx); return r.getMessage();
	}
	
	/**
	 * 
	 */
	public static final boolean isCausedBy(Throwable tx, final Class<? extends Throwable> cause) {
		for(; tx != null; tx = tx.getCause()) if(cause.isAssignableFrom(tx.getClass())) return true; return false;
	}
}
