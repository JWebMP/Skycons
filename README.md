# JWebMP Skycons

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/skycons)](https://central.sonatype.com/artifact/com.jwebmp.plugins/skycons)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-21-DD0031?logo=angular)

<!-- Tech icons row -->
![Skycons](https://img.shields.io/badge/Skycons-1.0.0-blueviolet)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

Animated weather icons rendered on HTML5 Canvas elements for JWebMP applications. 10 animated weather glyphs including sun, moon, clouds, rain, snow, sleet, wind, and fog.

Built on [Skycons](https://darkskyapp.github.io/skycons/) · [Angular 21](https://angular.dev/) · [JWebMP Core](https://jwebmp.com/) · JPMS module `com.jwebmp.plugins.skycons` · Java 25+

**Version: 1.0.0** — Animated weather icon set with Canvas rendering and configurable colour.

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>skycons</artifactId>
  <version>2.0.0-SNAPSHOT</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:skycons:2.0.0-SNAPSHOT")
```
</details>

## Features

- **10 Animated Weather Icons** — Clear Day, Clear Night, Rain, Snow, Sleet, Wind, Fog, Cloudy, Partly Cloudy Day, Partly Cloudy Night
- **HTML5 Canvas Rendering** — Smooth animations via requestAnimationFrame
- **Configurable Colour** — Global colour setting for all skycon instances
- **CRTP Fluent API** — `Skycon<J>` component with type-safe method chaining
- **Resize Clear** — Android hack support via `resizeClear` option
- **Zero Configuration** — Auto-registered via ServiceLoader SPI
- **Modular Architecture** — JPMS module with explicit dependencies

## Quick Start

### Prerequisites

- **Java 25 LTS** (required)
- **Maven 3.8+**
- **Node.js 18+** (for frontend builds)
- **Angular 21+** (auto-integrated via JWebMP)

### Basic Usage

```java
import com.jwebmp.plugins.skycons.Skycon;
import com.jwebmp.plugins.skycons.SkyIcon;

// Create a partly cloudy day icon (60x60)
var icon = new Skycon<>("weather1", 60, SkyIcon.Partly_Cloudy_Day);

// Rain icon
var rain = new Skycon<>("weather2", 60, SkyIcon.Rain);

// Snow icon
var snow = new Skycon<>("weather3", 60, SkyIcon.Snow);
```

### Available Icons

```java
SkyIcon.Clear_Day
SkyIcon.Clear_Night
SkyIcon.Rain
SkyIcon.Snow
SkyIcon.Sleet
SkyIcon.Wind
SkyIcon.Fog
SkyIcon.Cloudy
SkyIcon.Partly_Cloudy_Day
SkyIcon.Partly_Cloudy_Night
```

### Configure Colour

```java
import com.jwebmp.plugins.skycons.configurator.SkyconPageConfigurator;

// Set the global colour for all skycons
SkyconPageConfigurator.setColour("steelblue");
```

---

## Architecture

### Module Structure

```
src/main/java/com/jwebmp/plugins/skycons/
├── Skycon.java                        # CRTP Canvas icon component
├── SkyconFeature.java                 # JS feature — adds icon to skycons instance
├── SkyconOptions.java                 # Options (colour, resizeClear)
├── SkyIcon.java                       # Enum of 10 weather icon types
├── configurator/
│   ├── SkyconPageConfigurator.java    # Auto-registration via ServiceLoader
│   ├── SkyconSetupFeature.java        # JS — creates Skycons instance
│   └── SkyconStartFeature.java        # JS — starts animation playback
└── implementations/
    ├── SkyconInclusionModule.java
    └── SkyconsExclusionsModule.java
```

---

## API Reference

### Skycon Component

```java
public class Skycon<J extends Skycon<J>>
    extends Canvas<J>

// Constructor
new Skycon<>("id", 60, SkyIcon.Clear_Day)  // id, widthHeight, icon

// Methods
icon.getIcon()                  // Returns the SkyIcon enum value
icon.setIcon(SkyIcon.Rain)      // Fluent setter — returns J
icon.getOptions()               // Returns SkyconOptions
icon.getFeature()               // Returns the SkyconFeature
icon.getStartFeature()          // Returns the SkyconStartFeature
```

### SkyIcon Enum

```java
SkyIcon.Clear_Day.toString()          // → "clear-day"
SkyIcon.Partly_Cloudy_Night.toString() // → "partly-cloudy-night"
```

### SkyconOptions

```java
SkyconOptions<?> opts = icon.getOptions();
opts.setColour("white");        // Set icon colour
opts.setResizeClear(true);      // Android resize hack
```

---

## Configuration

### Auto-Configuration via PageConfigurator

The plugin is automatically configured when present on the classpath. It registers the skycons JavaScript library via npm.

### Global Colour

```java
SkyconPageConfigurator.setColour("steelblue");
```

---

## Module Graph

```
com.jwebmp.plugins.skycons
 ├── com.jwebmp.core                       (JWebMP core)
 ├── com.jwebmp.core.base.angular.client   (Angular client annotations)
 └── com.guicedee.guicedinjection          (Guice DI)
```

### Exported Packages

- `com.jwebmp.plugins.skycons` — Icon component, enum, options, and feature
- `com.jwebmp.plugins.skycons.configurator` — Page configurator and setup features

---

## Testing

```bash
mvn clean test
```

---

## Documentation

- **[Skycons Demo](https://darkskyapp.github.io/skycons/)** — Original animated weather icons demo
- **[JWebMP Home](https://jwebmp.com/)** — JWebMP framework documentation

| File | Purpose |
|------|---------|
| `Skycon.java` | CRTP Canvas icon component |
| `SkyIcon.java` | Enum with 10 weather icons |
| `SkyconFeature.java` | JS feature for adding icons |
| `SkyconOptions.java` | Options (colour, resizeClear) |
| `SkyconPageConfigurator.java` | Auto-configuration via ServiceLoader |
| `module-info.java` | JPMS module descriptor |

---

## Security

- No external network calls at runtime
- No secrets or credentials required
- Pure JavaScript Canvas animation library

---

## Contributing

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/my-feature`)
3. **Commit with clear messages** (`git commit -m "feat: add new icon"`)
4. **Push to your fork** (`git push origin feature/my-feature`)
5. **Open a Pull Request**

---

## Project Status

| Aspect | Status |
|--------|--------|
| **Version** | 1.0.0 / 2.0.0-SNAPSHOT |
| **Icons** | 10 animated weather glyphs |
| **Java** | 25 LTS (required) |
| **Build** | Passing |
| **License** | Apache 2.0 |
| **Maintenance** | Active |

---

## Links

- **GitHub Repository**: https://github.com/JWebMP/JWebMP
- **Skycons Demo**: https://darkskyapp.github.io/skycons/
- **JWebMP Home**: https://jwebmp.com/

---

## License

Licensed under the [Apache License 2.0](LICENSE).

```
Copyright 2025 JWebMP Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
```

---

## Acknowledgments

- **[Dark Sky / Skycons](https://darkskyapp.github.io/skycons/)** — Original animated weather icons
- **[JWebMP](https://jwebmp.com/)** — Server-driven web framework
- **[Angular](https://angular.dev/)** — Modern web framework

---

## Support

- **GitHub Issues**: https://github.com/JWebMP/JWebMP/issues
- **Discussions**: https://github.com/JWebMP/JWebMP/discussions

---

**Made with JWebMP**

