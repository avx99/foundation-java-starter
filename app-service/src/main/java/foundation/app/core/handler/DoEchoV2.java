package foundation.app.core.handler;

import dev.soffa.foundation.annotation.Feature;
import dev.soffa.foundation.context.Context;
import foundation.app.api.schema.EchoInput;
import foundation.app.api.schema.Message;
import foundation.app.api.usecase.Echo;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.inject.Named;

@Named
@Feature(name = "features.echo.v2")
public class DoEchoV2 implements Echo {

    @Override
    public Message handle(EchoInput input, @NonNull Context context) {
        return new Message(input.getMessage());
    }

}
