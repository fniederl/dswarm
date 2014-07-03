package org.dswarm.init;

/**
 * The exception class for DMP exceptions.<br>
 */

public class DMPException extends Exception {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	/**
	 * Creates a new DMP exception with the given exception message.
	 *
	 * @param exception the exception message
	 */
	public DMPException(final String exception) {

		super(exception);
	}

	/**
	 * Creates a new DMP exception with the given exception message and a cause.
	 *
	 * @param message the exception message
	 * @param cause a previously thrown exception, causing this one
	 */
	public DMPException(final String message, final Throwable cause) {
		super(message, cause);
	}
}