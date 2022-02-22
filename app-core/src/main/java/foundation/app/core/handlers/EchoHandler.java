package foundation.app.core.handlers;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import foundation.app.api.operation.Echo;
import io.soffa.foundation.core.RequestContext;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.inject.Named;

@Named
public class EchoHandler implements Echo {

    @Override
    public EchoResponse handle(EchoRequest input, @NonNull RequestContext context) {
        return new EchoResponse(input.getMessage());
    }

}
