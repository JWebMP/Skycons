package com.jwebmp.plugins.skycons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.HashSet;
import java.util.Set;

public class SkyconsExclusionsModule
		implements IGuiceScanModuleExclusions<SkyconsExclusionsModule>
{

	@Override
	public Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.skycons");
		return strings;
	}
}
