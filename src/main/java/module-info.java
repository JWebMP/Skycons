import com.jwebmp.plugins.skycons.implementations.SkyconInclusionModule;

module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;

	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;
	provides com.guicedee.client.services.config.IGuiceScanModuleInclusions with SkyconInclusionModule;

	opens com.jwebmp.plugins.skycons.configurator to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.skycons to com.fasterxml.jackson.databind, com.google.guice, com.jwebmp.core;
}
