package com.jwebmp.plugins.skycons.configurator;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

/**
 * Page configurator for Skycons — animated weather icons using HTML5 Canvas.
 */
@PluginInformation(pluginName = "Skycons",
		pluginUniqueName = "skycons",
		pluginDescription = "Skycons — animated weather glyphs rendered on HTML5 Canvas elements.",
		pluginVersion = "1.0.0",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "icons, weather, canvas",
		pluginSubtitle = "Animated weather icons for Canvas",
		pluginGitUrl = "https://github.com/JWebMP/JWebMP",
		pluginSourceUrl = "https://darkskyapp.github.io/skycons/",
		pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
		pluginOriginalHomepage = "https://darkskyapp.github.io/skycons/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/skycons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2026/05/09",
		pluginGroupId = "com.jwebmp.plugins",
		pluginArtifactId = "skycons",
		pluginModuleName = "com.jwebmp.plugins.skycons",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "skycons", version = "^1.0.0")
@NgScript("node_modules/skycons/skycons.js")
@SuppressWarnings("unused")
public class SkyconPageConfigurator
		implements IPageConfigurator<SkyconPageConfigurator>
{
	/**
	 * Field colour
	 */
	private static String colour = "black";

	public SkyconPageConfigurator()
	{
		//No Config Required
	}

	/**
	 * Method getColour returns the colour of this SkyconPageConfigurator object.
	 *
	 * @return the colour (type String) of this SkyconPageConfigurator object.
	 */
	public static String getColour()
	{
		return SkyconPageConfigurator.colour;
	}

	/**
	 * Method setColour sets the colour of this SkyconPageConfigurator object.
	 *
	 * @param colour
	 * 		the colour of this SkyconPageConfigurator object.
	 */
	public static void setColour(String colour)
	{
		SkyconPageConfigurator.colour = colour;
	}

	@Override
	public IPage<?> configure(IPage<?> page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return true;
	}
}
