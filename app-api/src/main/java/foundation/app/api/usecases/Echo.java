package foundation.app.api.usecases;

import dev.soffa.foundation.core.Operation;
import foundation.app.api.schema.Message;

public interface Echo extends Operation<EchoInput, Message> {
}
