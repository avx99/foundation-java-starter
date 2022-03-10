package foundation.app.api;

import dev.soffa.foundation.annotations.Bind;
import dev.soffa.foundation.context.Context;
import foundation.app.api.schema.Message;
import foundation.app.api.usecases.Echo;
import foundation.app.api.usecases.EchoInput;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import javax.ws.rs.Path;

@Tags(
    @Tag(name = "Echo", description = "All things echo messaging")
)
public interface EchoAPI {

    @Operation(
        method = "POST",
        summary = "Echo the input message"
    )
    @Path("echo")
    @Bind(Echo.class)
    Message echo(EchoInput request, Context context);

}
