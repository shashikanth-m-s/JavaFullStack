package com.smsvertx.app.vertex_coreexample;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

/**
 * Hello world!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Vertx vrtx=Vertx.vertx();
        
        HttpServer server=vrtx.createHttpServer();
        
        Router router=Router.router(vrtx);
        
        Route hand=router.route().handler(RoutingContext->{
        	
        	HttpServerResponse resp=RoutingContext.response();
        	resp.setChunked(true).write("hello");
        	
        });
        server.requestHandler(router).listen(998);
        
    }
}
