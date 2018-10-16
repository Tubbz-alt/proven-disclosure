/**
 * 
 */
package gov.pnnl.proven.disclosure;

import java.io.Serializable;

/**
 * Represents a request that may be serviced by a {@link ProvenModule}
 * 
 * @author d3j766
 *
 */
public class ProxyRequest<T> implements Serializable {

	/**
	 * Request input type
	 */
	T t;

	/**
	 * Maximum number of request retries before being sent to error stream
	 */
	private int retries;

	/**
	 * Time to live (in seconds) before being removed from a request buffer.
	 */
	private int ttl;

	/**
	 * Request constructor. Input of request is required at time of
	 * construction.
	 * 
	 * @param t
	 *            the type of input for the request
	 */
	public ProxyRequest(T t) {
		this.t = t;
	}

	public int getRetries() {
		return retries;
	}

	public void setRetries(int retries) {
		this.retries = retries;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}


}
