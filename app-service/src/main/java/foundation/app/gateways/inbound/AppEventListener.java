package foundation.app.gateways.inbound;

import io.soffa.foundation.actions.EventHandler;
import io.soffa.foundation.events.Event;
import io.soffa.foundation.pubsub.PubSubListener;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AppEventListener implements PubSubListener {

    private EventHandler eventHandler;

    @SneakyThrows
    @Override
    public void handle(Event event) {
        eventHandler.handle(event);
    }

}
