package foundation.app.api.usecases;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EchoInput {

    @NotEmpty
    @Schema(description = "The message to echo back")
    private String message;

}
