package com.sample.http.identifiers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.twitter.finagle.Dtab;
import com.twitter.finagle.Path;
import com.twitter.finagle.http.Request;
import com.twitter.finagle.service.ReqRep;
import com.twitter.finagle.service.ResponseClass;
import com.twitter.util.Future;

import io.buoyant.linkerd.ResponseClassifierConfig;
import scala.Function0;
import scala.Function1;
import scala.PartialFunction;
import io.buoyant.linkerd.protocol.HttpIdentifierConfig;
import io.buoyant.router.RoutingFactory;
import io.buoyant.router.RoutingFactory.RequestIdentification;

public class SampledentifierConfig extends HttpIdentifierConfig {

	@Override
	@JsonIgnore
	public PartialFunction<Request, Future<RequestIdentification<Request>>> newIdentifier(Path arg0, Function0<Dtab> arg1) {
		return new SampleChainIdentifier();
	}
}
