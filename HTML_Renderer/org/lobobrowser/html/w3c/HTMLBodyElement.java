/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project. Copyright (C) 2014 - 2015 Lobo Evolution

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published by the Free Software Foundation; either
    version 2.1 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net; ivan.difrancesco@yahoo.it
 */
/*
 * Copyright (c) 2003 World Wide Web Consortium,
 * (Massachusetts Institute of Technology, Institut National de
 * Recherche en Informatique et en Automatique, Keio University). All
 * Rights Reserved. This program is distributed under the W3C's Software
 * Intellectual Property License. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.
 * See W3C License http://www.w3.org/Consortium/Legal/ for more details.
 */

package org.lobobrowser.html.w3c;

/**
 * The HTML document body. This element is always present in the DOM API, even
 * if the tags are not present in the source document. See the BODY element
 * definition in HTML 4.01.
 * <p>
 * See also the <a
 * 
 * Object Model (DOM) Level 2 HTML Specification</a>.
 */
public interface HTMLBodyElement extends HTMLElement {
	/**
	 * Color of active links (after mouse-button down, but before mouse-button
	 * up). See the alink attribute definition in HTML 4.01. This attribute is
	 * deprecated in HTML 4.01.
	 */
	public String getALink();

	/**
	 * Color of active links (after mouse-button down, but before mouse-button
	 * up). See the alink attribute definition in HTML 4.01. This attribute is
	 * deprecated in HTML 4.01.
	 */
	public void setALink(String aLink);

	/**
	 * URI [<a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396</a>] of
	 * the background texture tile image. See the background attribute
	 * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public String getBackground();

	/**
	 * URI [<a href='http://www.ietf.org/rfc/rfc2396.txt'>IETF RFC 2396</a>] of
	 * the background texture tile image. See the background attribute
	 * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public void setBackground(String background);

	/**
	 * Document background color. See the bgcolor attribute definition in HTML
	 * 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public String getBgColor();

	/**
	 * Document background color. See the bgcolor attribute definition in HTML
	 * 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public void setBgColor(String bgColor);

	/**
	 * Color of links that are not active and unvisited. See the link attribute
	 * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public String getLink();

	/**
	 * Color of links that are not active and unvisited. See the link attribute
	 * definition in HTML 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public void setLink(String link);

	/**
	 * Document text color. See the text attribute definition in HTML 4.01. This
	 * attribute is deprecated in HTML 4.01.
	 */
	public String getText();

	/**
	 * Document text color. See the text attribute definition in HTML 4.01. This
	 * attribute is deprecated in HTML 4.01.
	 */
	public void setText(String text);

	/**
	 * Color of links that have been visited by the user. See the vlink
	 * attribute definition in HTML 4.01. This attribute is deprecated in HTML
	 * 4.01.
	 */
	public String getVLink();

	/**
	 * Color of links that have been visited by the user. See the vlink
	 * attribute definition in HTML 4.01. This attribute is deprecated in HTML
	 * 4.01.
	 */
	public void setVLink(String vLink);

	/*
	 * public Function getOnafterprint(); public void setOnafterprint(Function
	 * onafterprint); public Function getOnbeforeprint(); public void
	 * setOnbeforeprint(Function onbeforeprint); public Function
	 * getOnbeforeunload(); public void setOnbeforeunload(Function
	 * onbeforeunload); public Function getOnblur(); public void
	 * setOnblur(Function onblur); public Function getOnerror(); public void
	 * setOnerror(Function onerror); public Function getOnfocus(); public void
	 * setOnfocus(Function onfocus); public Function getOnhashchange(); public
	 * void setOnhashchange(Function onhashchange); public Function getOnload();
	 * public void setOnload(Function onload); public Function getOnmessage();
	 * public void setOnmessage(Function onmessage); public Function
	 * getOnoffline(); public void setOnoffline(Function onoffline); public
	 * Function getOnonline(); public void setOnonline(Function ononline);
	 * public Function getOnpopstate(); public void setOnpopstate(Function
	 * onpopstate); public Function getOnpagehide(); public void
	 * setOnpagehide(Function onpagehide); public Function getOnpageshow();
	 * public void setOnpageshow(Function onpageshow); public Function
	 * getOnredo(); public void setOnredo(Function onredo); public Function
	 * getOnresize(); public void setOnresize(Function onresize); public
	 * Function getOnstorage(); public void setOnstorage(Function onstorage);
	 * public Function getOnundo(); public void setOnundo(Function onundo);
	 * public Function getOnunload(); public void setOnunload(Function
	 * onunload);
	 */
}
