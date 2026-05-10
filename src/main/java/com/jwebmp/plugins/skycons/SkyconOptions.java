package com.jwebmp.plugins.skycons;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;


/**
 * The options available for the skycons
 *
 * @param <J>
 */
public class SkyconOptions<J extends SkyconOptions<J>>
		extends JavaScriptPart<J>
{
	private String colour;
	private Boolean resizeClear;

	public SkyconOptions()
	{
		//No config required
	}

	/**
	 * Sets the colour going to be used for all skycons in the collection
	 *
	 * @return
	 */
	public String getColour()
	{
		return colour;
	}

	/**
	 * Sets the colour to be used
	 *
	 * @param colour
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setColour(String colour)
	{
		this.colour = colour;
		return (J) this;
	}

	/**
	 * on Android, a nasty hack is needed: {"resizeClear": true}
	 *
	 * @return if it is set
	 */
	public Boolean getResizeClear()
	{
		return resizeClear;
	}

	/**
	 * on Android, a nasty hack is needed: {"resizeClear": true}
	 *
	 * @param resizeClear
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setResizeClear(Boolean resizeClear)
	{
		this.resizeClear = resizeClear;
		return (J) this;
	}
}
