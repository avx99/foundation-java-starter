package foundation.app.api.operation;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import io.soffa.foundation.core.Operation;

public interface Echo extends Operation<EchoRequest, EchoResponse> {
}
