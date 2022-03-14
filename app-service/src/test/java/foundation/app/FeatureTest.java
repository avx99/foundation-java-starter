package foundation.app;

import dev.soffa.foundation.test.BaseFeatureTest;
import org.checkerframework.com.google.common.collect.ImmutableMap;

import java.util.Map;


class FeatureTest extends BaseFeatureTest {

    @Override
    public String[] getFeatures() {
        return new String[]{"echo"};
    }

    @Override
    public Map<String, Object> getTestData() {
        return ImmutableMap.of();
    }
}
