package com.jwebmp.plugins.skycons.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;
import com.guicedee.client.services.config.IGuiceScanJarExclusions;
import java.util.LinkedHashSet;
import java.util.Set;

/** SPI services and direct resource access do not require scanning this library. */
public class SkyconsExclusionsModule implements IGuiceScanModuleExclusions<SkyconsExclusionsModule>, IGuiceScanJarExclusions<SkyconsExclusionsModule> {
    @Override public Set<String> excludeModules() { return Set.of("com.jwebmp.plugins.skycons"); }
    @Override public Set<String> excludeJars() {
        Set<String> jars = new LinkedHashSet<>();
        jars.add("skycons.jar");
        for (int digit = 0; digit <= 9; digit++) jars.add("skycons-" + digit + "*.jar");
        return jars;
    }
}
