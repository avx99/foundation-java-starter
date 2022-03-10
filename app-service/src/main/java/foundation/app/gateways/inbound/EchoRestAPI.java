package foundation.app.gateways.inbound;

import dev.soffa.foundation.context.Context;
import foundation.app.api.EchoAPI;
import foundation.app.api.usecases.EchoInput;
import foundation.app.api.schema.Message;
import foundation.app.api.usecases.Echo;
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
    public Message echo(@Valid @RequestBody EchoInput input, Context context) {
        return echoOp.handle(input, context);
    }
}
