module com.jwebmp.plugins.skycons {
	exports com.jwebmp.plugins.skycons;
	exports com.jwebmp.plugins.skycons.configurator;

	requires com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;

	provides com.guicedee.client.services.config.IGuiceScanModuleExclusions with com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;

	opens com.jwebmp.plugins.skycons.configurator to tools.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.skycons to tools.jackson.databind, com.google.guice, com.jwebmp.core;

    provides com.guicedee.client.services.config.IGuiceScanJarExclusions with com.jwebmp.plugins.skycons.implementations.SkyconsExclusionsModule;
}
