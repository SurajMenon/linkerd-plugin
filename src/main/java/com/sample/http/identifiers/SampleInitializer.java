package com.sample.http.identifiers;

import io.buoyant.linkerd.IdentifierInitializer;

/***
 * Initializes all the strati rs components needed for policy
 * @author smenon2
 */
public class SampleInitializer extends IdentifierInitializer {
	
	boolean initialized = false;
	
	@Override
	public String configId() {
		init();
		return "io.buoyant.helloWorldIdentifier";
	}
	
	private void init() {
		if (!initialized) {
			// Intialize java classes here
			initialized = true;
		}
	}
	
	public Class<?> configClass() {
		return SampledentifierConfig.class;
	}
}
