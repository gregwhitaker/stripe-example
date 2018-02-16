package stripe.example;

import com.github.gregwhitaker.ratpack.error.ErrorModule;
import ratpack.groovy.template.TextTemplateModule;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;
import stripe.example.api.ApiEndpoints;
import stripe.example.api.ApiModule;
import stripe.example.config.StripeConfig;
import stripe.example.service.ServiceModule;

/**
 * Starts the stripe-example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yaml")
                        .env()
                        .require("/stripe", StripeConfig.class)
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(ErrorModule.class)
                        .module(ApiModule.class)
                        .module(ServiceModule.class)
                        .module(TextTemplateModule.class))
                )
                .handlers(chain -> chain
                        .insert(ApiEndpoints.class)
                        .files(f -> f.dir("templates").indexFiles("index.html"))
                )
        );
    }
}
