package foundation.app.api.usecase;

import dev.soffa.foundation.core.UseCase;
import foundation.app.api.schema.EchoInput;
import foundation.app.api.schema.Message;

public interface Echo extends UseCase<EchoInput, Message> {
}
