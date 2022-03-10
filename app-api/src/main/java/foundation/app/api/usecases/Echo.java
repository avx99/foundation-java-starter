package foundation.app.api.usecases;

import dev.soffa.foundation.core.UseCase;
import foundation.app.api.schema.Message;

public interface Echo extends UseCase<EchoInput, Message> {
}
