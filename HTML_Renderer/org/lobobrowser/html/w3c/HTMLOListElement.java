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
 * Ordered list. See the OL element definition in HTML 4.01.
 * <p>
 * See also the <a
 * 
 * Object Model (DOM) Level 2 HTML Specification</a>.
 */
public interface HTMLOListElement extends HTMLElement {
	/**
	 * Reduce spacing between list items. See the compact attribute definition
	 * in HTML 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public boolean getCompact();

	/**
	 * Reduce spacing between list items. See the compact attribute definition
	 * in HTML 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public void setCompact(boolean compact);

	/**
	 * Starting sequence number. See the start attribute definition in HTML
	 * 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public int getStart();

	/**
	 * Starting sequence number. See the start attribute definition in HTML
	 * 4.01. This attribute is deprecated in HTML 4.01.
	 */
	public void setStart(int start);

	/**
	 * Numbering style. See the type attribute definition in HTML 4.01. This
	 * attribute is deprecated in HTML 4.01.
	 */
	public String getType();

	/**
	 * Numbering style. See the type attribute definition in HTML 4.01. This
	 * attribute is deprecated in HTML 4.01.
	 */
	public void setType(String type);

	// HTMLOListElement
	public boolean getReversed();

	public void setReversed(boolean reversed);

}
