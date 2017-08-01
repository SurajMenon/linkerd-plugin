package com.sample.http.classifier;

import io.buoyant.linkerd.ResponseClassifierInitializer;

/**
 * This config initializer is loaded by linkerd at startup and registers the
 * `StratiClassifierConfig` class under the id "io.strati.stratiClassifier".
 * This tells linkerd's config system to deserialize response classifier config
 * blocks to `StratiClassifierConfig` if the kind is
 * "io.strati.stratiClassifier".
 *
 * In order for linkerd to load this class, it must be listed in the
 * `META-INF/services/io.l5d.linkerd.ResponseClassifierInitializer` file.
 */
public class SampleClassifierInitializer extends ResponseClassifierInitializer {
    @Override
    public String configId() {
        return "io.buoyant.headerClassifier";
    }

    public Class<?> configClass() {
        return SampleClassifierConfig.class;
    }
}