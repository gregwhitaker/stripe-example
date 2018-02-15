package stripe.example;

import com.github.gregwhitaker.ratpack.error.ErrorModule;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;
import stripe.example.api.ApiEndpoints;
import stripe.example.api.ApiModule;
import stripe.example.data.DataModule;
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
//                        .require("/auth", AuthConfig.class)
//                        .require("/database", DatabaseConfig.class)
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(ErrorModule.class)
                        .module(ApiModule.class)
                        .module(ServiceModule.class)
                        .module(DataModule.class))
                )
                .handlers(chain -> chain
                        .insert(ApiEndpoints.class)
                        .files(f -> f.dir("public").indexFiles("index.html"))
                )
        );
    }
}
