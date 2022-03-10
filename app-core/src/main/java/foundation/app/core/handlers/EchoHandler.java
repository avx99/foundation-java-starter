package foundation.app.core.handlers;

import dev.soffa.foundation.context.Context;
import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import foundation.app.api.operation.Echo;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.inject.Named;

@Named
public class EchoHandler implements Echo {

    @Override
    public EchoResponse handle(EchoRequest input, @NonNull Context context) {
        return new EchoResponse(input.getMessage());
    }

}
