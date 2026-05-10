package com.jwebmp.plugins.skycons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class SkyconInclusionModule implements IGuiceScanModuleInclusions<SkyconInclusionModule>
{
	@Override
	public Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.skycons");
		return set;
	}
}
