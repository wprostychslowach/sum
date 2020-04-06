package startup;

import adapters.persistence.SQLRepository;
import adapters.rest.ExternalHttpEndpoint;
import domain.addition.SumTwoNumbersApi;
import domain.addition.SumTwoNumbersService;

class CompositionRoot {
    static SumTwoNumbersApi build() {
        return new SumTwoNumbersService(new SQLRepository(), new ExternalHttpEndpoint());
    }
}
