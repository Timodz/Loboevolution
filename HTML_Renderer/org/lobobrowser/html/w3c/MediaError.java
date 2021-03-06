package org.lobobrowser.html.w3c;

public interface MediaError {
	// MediaError
	public static final short MEDIA_ERR_ABORTED = 1;
	public static final short MEDIA_ERR_NETWORK = 2;
	public static final short MEDIA_ERR_DECODE = 3;
	public static final short MEDIA_ERR_SRC_NOT_SUPPORTED = 4;

	public short getCode();
}
