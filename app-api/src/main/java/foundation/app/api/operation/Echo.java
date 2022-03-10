package foundation.app.api.operation;

import dev.soffa.foundation.core.Operation;
import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;

public interface Echo extends Operation<EchoRequest, EchoResponse> {
}
