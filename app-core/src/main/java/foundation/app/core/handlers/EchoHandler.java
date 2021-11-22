package foundation.app.core.handlers;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import foundation.app.core.actions.Echo;
import io.soffa.foundation.core.RequestContext;

import javax.inject.Named;

@Named
public class EchoHandler implements Echo {

    @Override
    public EchoResponse handle(EchoRequest request, RequestContext context) {
        return new EchoResponse(request.getMessage());
    }

}
