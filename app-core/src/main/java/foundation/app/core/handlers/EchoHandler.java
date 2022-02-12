package foundation.app.core.handlers;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import foundation.app.api.operation.Echo;
import io.soffa.foundation.context.RequestContext;

import javax.inject.Named;

@Named
public class EchoHandler implements Echo {

    @Override
    public EchoResponse handle(EchoRequest request, RequestContext context) {
        return new EchoResponse(request.getMessage());
    }

}
