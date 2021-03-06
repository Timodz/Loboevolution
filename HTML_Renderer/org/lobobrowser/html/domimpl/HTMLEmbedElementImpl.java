/*
    GNU LESSER GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The XAMJ Project

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

    Contact info: lobochief@users.sourceforge.net
 */
package org.lobobrowser.html.domimpl;

import org.lobobrowser.html.HtmlAttributeProperties;
import org.lobobrowser.html.w3c.HTMLEmbedElement;

public class HTMLEmbedElementImpl extends HTMLElementImpl implements
		HTMLEmbedElement {

	public HTMLEmbedElementImpl(String name) {
		super(name);
	}

	@Override
	public String getSrc() {
		return this.getAttribute(HtmlAttributeProperties.SRC);
	}

	@Override
	public void setSrc(String src) {
		this.setAttribute(HtmlAttributeProperties.SRC,src);
		
	}

	@Override
	public String getType() {
		return this.getAttribute(HtmlAttributeProperties.TYPE);
	}

	@Override
	public void setType(String type) {
		this.setAttribute(HtmlAttributeProperties.TYPE,type);
		
	}

	@Override
	public String getWidth() {
		return this.getAttribute(HtmlAttributeProperties.WIDTH);
	}

	@Override
	public void setWidth(String width) {
		this.setAttribute(HtmlAttributeProperties.WIDTH,width);
		
	}

	@Override
	public String getHeight() {
		return this.getAttribute(HtmlAttributeProperties.HEIGHT);
	}

	@Override
	public void setHeight(String height) {
		this.setAttribute(HtmlAttributeProperties.HEIGHT,height);
		
	}

	@Override
	public String getAlign() {
		return this.getAttribute(HtmlAttributeProperties.ALIGN);
	}

	@Override
	public void setAlign(String align) {
		this.setAttribute(HtmlAttributeProperties.ALIGN,align);
		
	}

	@Override
	public String getName() {
		return this.getAttribute(HtmlAttributeProperties.NAME);
	}

	@Override
	public void setName(String name) {
		this.setAttribute(HtmlAttributeProperties.NAME,name);
	}
}
