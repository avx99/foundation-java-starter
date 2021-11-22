package foundation.app.gateways.inbound;

import foundation.app.api.EchoAPI;
import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import foundation.app.core.actions.Echo;
import io.soffa.foundation.actions.ActionDispatcher;
import io.soffa.foundation.core.RequestContext;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class EchoRestAPI implements EchoAPI {

    private ActionDispatcher dispatcher;

    @Override
    @PostMapping("echo")
    public EchoResponse echo(@Valid @RequestBody EchoRequest request, RequestContext context) {
        return dispatcher.dispatch(Echo.class, request, context);
    }
}
