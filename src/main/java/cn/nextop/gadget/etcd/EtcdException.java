package cn.nextop.gadget.etcd;

/**
 * @author Baoyi Chen
 */
public class EtcdException extends RuntimeException {
	//
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public EtcdException() {
		super();
	}
	
	public EtcdException(String message) {
		super(message);
	}
	
	public EtcdException(Throwable cause) {
		super(cause);
	}
	
	public EtcdException(String message, Throwable t) {
		super(message, t);
	}
}
