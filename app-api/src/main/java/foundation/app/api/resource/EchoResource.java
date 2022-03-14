package foundation.app.api.resource;

import dev.soffa.foundation.resource.Resource;
import foundation.app.api.schema.Message;
import foundation.app.api.usecase.Echo;
import foundation.app.api.schema.EchoInput;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@Tags(
    @Tag(name = "Echo", description = "All things echo messaging")
)
@RestController // Cette interface sera implémentée automatiquement lorsque cette annotation est présente + Resource
public interface EchoResource extends Resource {

    @Operation(
        method = "POST",
        summary = "Echo the input message"
    )
    @PostMapping("echo")
    default Message echo(@Valid @RequestBody EchoInput input) {
        return invoke(Echo.class, input);
    }

}
