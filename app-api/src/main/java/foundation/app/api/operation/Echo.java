package foundation.app.api.operation;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import io.soffa.foundation.api.Operation;
/*
@Operation(
        method = "POST",
        summary = "Echo the input message",
        parameters = {
            @Parameter(ref = ApiHeaders.TENANT_ID)
        }
    )
    @Path("echo")
 */

public interface Echo extends Operation<EchoRequest, EchoResponse> {
}
