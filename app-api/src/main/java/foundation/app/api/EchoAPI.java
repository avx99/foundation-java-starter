package foundation.app.api;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import io.soffa.foundation.core.RequestContext;
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
    EchoResponse echo(EchoRequest request, RequestContext context);

}
