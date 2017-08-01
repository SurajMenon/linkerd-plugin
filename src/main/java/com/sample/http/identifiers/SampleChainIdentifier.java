package com.sample.http.identifiers;

import org.jboss.netty.handler.codec.http.HttpRequest;

import com.twitter.finagle.Dtab;
import com.twitter.finagle.Path;
import com.twitter.finagle.http.Request;
import com.twitter.util.Function;
import com.twitter.util.Future;

import io.buoyant.router.RoutingFactory.RequestIdentification;
import io.buoyant.router.RoutingFactory.RequestIdentification;
import io.buoyant.router.RoutingFactory.UnidentifiedRequest;
import scala.Function0;

/**
 * This class intercepts the requests & throws a SOA exception, in case of a
 * policy violation
 * 
 * @author smenon2
 *        
 */
public class SampleChainIdentifier extends Function<Request, Future<RequestIdentification<Request>>> {
	
	public SampleChainIdentifier() {
		super();
	}
	
	public Future<RequestIdentification<Request>> apply(Request req) {
		
		HttpRequest http = null;
		if ((req instanceof Request)) {
			http = req.httpRequest();
		}
		
		if ((req instanceof HttpRequest)) {
			http = (HttpRequest) req;
		}
		
		if (http != null) {
			
			try {
				//TODO : Add Authentication
				
			} catch (Exception e) {
				throw e; // Returns Http status code 502
				//return Future.rawException(e); // Returns Http status code 400. 
			}
		}
		return Future.value(new UnidentifiedRequest<Request>("MoveOn to next identifier"));
		
	}
	

}
