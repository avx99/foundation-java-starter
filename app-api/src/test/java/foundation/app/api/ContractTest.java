package foundation.app.api;

import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.jupiter.api.Test;

public class ContractTest {

    @Test
    public void testPojo() {
        Validator validator = ValidatorBuilder.create()
            .with(new SetterTester())
            .with(new GetterTester())
            .build();
        validator.validate("foundation.app.api.model", new FilterPackageInfo());

    }

}
