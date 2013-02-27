package com.leacox.jackson.dataformat.toml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;

public class TomlFactory extends JsonFactory {
	private static final long serialVersionUID = -4038406691493301378L;

	/**
	 * Name used to identify TOML format (and returned by
	 * {@link #getFormatName()}
	 */
	public final static String FORMAT_NAME_TOML = "TOML";

	/**
	 * Bitfield (set of flags) of all parser features that are enabled by
	 * default.
	 */
	// final static int DEFAULT_TOML_PARSER_FEATURE_FLAGS =
	// FromXmlParser.Feature.collectDefaults();

	/**
	 * Bitfield (set of flags) of all generator features that are enabled by
	 * default.
	 */
	// final static int DEFAULT_TOML_GENERATOR_FEATURE_FLAGS =
	// ToXmlGenerator.Feature.collectDefaults();

	/**
	 * Default constructor used to create factory instances. Creation of a
	 * factory instance is a light-weight operation, but it is still a good idea
	 * to reuse limited number of factory instances (and quite often just a
	 * single instance): factories are used as context for storing some reused
	 * processing objects (such as symbol tables parsers use) and this reuse
	 * only works within context of a single factory instance.
	 */
	public TomlFactory() {
		this(null);
	}

	public TomlFactory(ObjectCodec oc) {
		super(oc);
	}

	@Override
	public Version version() {
		return ModuleVersion.instance.version();
	}

	/*
	 * Format detection functionality (since 1.8)
	 */
	@Override
	public String getFormatName() {
		return FORMAT_NAME_TOML;
	}

	/**
	 * Sub-classes need to override this method (as of 1.8)
	 */
	@Override
	public MatchStrength hasFormat(InputAccessor acc) throws IOException {
		// TODO: Need a TomlValidator
		return MatchStrength.INCONCLUSIVE;
	}
}
