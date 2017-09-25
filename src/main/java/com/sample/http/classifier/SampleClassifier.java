package com.sample.http.classifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.jboss.netty.handler.codec.http.HttpRequest;

import com.twitter.finagle.http.Request;
import com.twitter.finagle.http.Response;
import com.twitter.finagle.service.ReqRep;
import com.twitter.finagle.service.ResponseClass;
import com.twitter.finagle.service.ResponseClass$;
import com.twitter.util.Function;

/**
 * SampleClassifier is an HTTP response classifier that classifies responses
 * based on wheather they is an Exception or not.
 * If they are then this updates the status code & error msg
 * 
 */
public class SampleClassifier extends Function<ReqRep, ResponseClass> {
	
	
	public SampleClassifier() {
		
	}
	
	/**
	 * This defines which inputs this classifier accepts. We accept any response
	 * where a SOA Exception is thrown
	 */
	@Override
	public boolean isDefinedAt(ReqRep reqRep) {
		return true;
	}
	
	/**
	 * Classify responses based on the header.
	 */
	
	public ResponseClass apply(ReqRep reqRep) {
		return ResponseClass$.MODULE$.Success();
	}
	
}
