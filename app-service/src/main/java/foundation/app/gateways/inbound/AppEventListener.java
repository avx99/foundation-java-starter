package foundation.app.gateways.inbound;

import io.soffa.foundation.actions.ActionDispatcher;
import io.soffa.foundation.events.Event;
import io.soffa.foundation.pubsub.PubSubListener;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AppEventListener implements PubSubListener {

    private ActionDispatcher dispatcher;

    @SneakyThrows
    @Override
    public void handle(Event event) {
        dispatcher.handle(event);
    }

}
