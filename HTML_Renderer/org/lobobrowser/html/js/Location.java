package org.lobobrowser.html.js;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.lobobrowser.html.HtmlRendererContext;
import org.lobobrowser.html.domimpl.HTMLDocumentImpl;
import org.lobobrowser.js.AbstractScriptableDelegate;
import org.w3c.dom.Document;

public class Location extends AbstractScriptableDelegate {
	private static final Logger logger = Logger.getLogger(Location.class.getName());
	private final Window window;

	Location(final Window window) {
		this.window = window;
	}

	private URL getURL() {
		URL url;
		try {
			Document document = this.window.getDocumentNode();
			url = document == null ? null : new URL(document.getDocumentURI());
		} catch (MalformedURLException mfu) {
			url = null;
		}
		return url;
	}

	public String getHash() {
		URL url = this.getURL();
		return url == null ? null : url.getRef();
	}

	public String getHost() {
		URL url = this.getURL();
		if (url == null) {
			return null;
		}
		return url.getHost() + (url.getPort() == -1 ? "" : ":" + url.getPort());
	}

	public String getHostname() {
		URL url = this.getURL();
		if (url == null) {
			return null;
		}
		return url.getHost();
	}

	public String getPathname() {
		URL url = this.getURL();
		return url == null ? null : url.getPath();
	}

	public String getPort() {
		URL url = this.getURL();
		if (url == null) {
			return null;
		}
		int port = url.getPort();
		return port == -1 ? null : String.valueOf(port);
	}

	public String getProtocol() {
		URL url = this.getURL();
		if (url == null) {
			return null;
		}
		return url.getProtocol() + ":";
	}

	public String getSearch() {
		URL url = this.getURL();
		String query = url == null ? null : url.getQuery();
		// Javascript requires "?" in its search string.
		return query == null ? "" : "?" + query;
	}

	private String target;

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String value) {
		this.target = value;
	}

	public String getHref() {
		Document document = this.window.getDocumentNode();
		return document == null ? null : document.getDocumentURI();
	}

	public void setHref(String uri) {
		HtmlRendererContext rcontext = this.window.getHtmlRendererContext();
		if (rcontext != null) {
			try {
				URL url;
				Document document = this.window.getDocumentNode();
				if (document instanceof HTMLDocumentImpl) {
					HTMLDocumentImpl docImpl = (HTMLDocumentImpl) document;
					url = docImpl.getFullURL(uri);
				} else {
					url = new URL(uri);
				}
				rcontext.navigate(url, this.target);
			} catch (MalformedURLException mfu) {
				logger.log(Level.WARNING, "setHref(): Malformed location: ["
						+ uri + "].", mfu);
			}
		}
	}

	public void reload() {
		Document document = this.window.getDocumentNode();
		if (document instanceof HTMLDocumentImpl) {
			HTMLDocumentImpl docImpl = (HTMLDocumentImpl) document;
			HtmlRendererContext rcontext = docImpl.getHtmlRendererContext();
			if (rcontext != null) {
				rcontext.reload();
			} else {
				docImpl.warn("reload(): No renderer context in Location's document.");
			}
		}
	}

	public void replace(String href) {
		this.setHref(href);
	}

	public String toString() {
		return this.getHref();
	}

	public void assign(String url) {
		this.setHref(url);
	}
}
