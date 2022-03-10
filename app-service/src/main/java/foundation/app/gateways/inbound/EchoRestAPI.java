package foundation.app.gateways.inbound;

import dev.soffa.foundation.context.Context;
import foundation.app.api.EchoAPI;
import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import foundation.app.api.operation.Echo;
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

    private final Echo echoOp;

    @Override
    @PostMapping("echo")
    public EchoResponse echo(@Valid @RequestBody EchoRequest input, Context context) {
        return echoOp.handle(input, context);
    }
}
