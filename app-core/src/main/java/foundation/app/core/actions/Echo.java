package foundation.app.core.actions;

import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import io.soffa.foundation.actions.Action;

public interface Echo extends Action<EchoRequest, EchoResponse> {
}
