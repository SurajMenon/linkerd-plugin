package com.sample.http.classifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.twitter.finagle.service.ReqRep;
import com.twitter.finagle.service.ResponseClass;
import io.buoyant.linkerd.ResponseClassifierConfig;
import scala.PartialFunction;

/**
 * StratiClassifierConfig defines the structure of the config block for this
 * plugin and constructs the response classifier.
 */
public class SampleClassifierConfig extends ResponseClassifierConfig {

    /**
     * Construct the repsonse classifier.
     */
    @Override
    @JsonIgnore
    public PartialFunction<ReqRep, ResponseClass> mk() {
        return new SampleClassifier();
    }
}