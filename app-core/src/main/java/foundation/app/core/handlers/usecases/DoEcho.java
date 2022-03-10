package foundation.app.core.handlers.usecases;

import dev.soffa.foundation.context.Context;
import foundation.app.api.usecases.EchoInput;
import foundation.app.api.schema.Message;
import foundation.app.api.usecases.Echo;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.inject.Named;

@Named
public class DoEcho implements Echo {

    @Override
    public Message handle(EchoInput input, @NonNull Context context) {
        return new Message(input.getMessage());
    }

}
