package com.jwebmp.plugins.skycons.configurator;

import com.jwebmp.core.Feature;


public class SkyconSetupFeature
		extends Feature
{
	public SkyconSetupFeature()
	{
		super("SetupSkycons");
		setSortOrder(Integer.MIN_VALUE);
	}

	@Override
	public Integer getSortOrder()
	{
		return Integer.MIN_VALUE;
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery("skycons = new Skycons({\"color\": \"" + SkyconPageConfigurator.getColour() + "\"});");
	}
}
