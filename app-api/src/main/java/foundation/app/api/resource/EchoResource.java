package foundation.app.api.resource;

import dev.soffa.foundation.context.Context;
import dev.soffa.foundation.resource.Resource;
import foundation.app.api.schema.EchoInput;
import foundation.app.api.schema.Message;
import foundation.app.api.usecase.Echo;
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


    /**
     * Commentaire développeur pour la méthode echo
     *
     * @param input   Données utilisateur
     * @param context Injectée automatiquement avec les informations de la requête en cours (n'apparaît pas dans la documentation OpenAPI)
     */
    @Operation(
        method = "POST",
        summary = "Echo the input message"
    )
    @PostMapping("echo")
    default Message echo(@Valid @RequestBody EchoInput input, Context context) {
        return invoke(Echo.class, input, context);
    }

}
