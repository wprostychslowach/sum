package adapters.rest;

import domain.addition.StorageGateway;

/* Hit endpoint to retrieve addition component */
public class ExternalHttpEndpoint implements StorageGateway {
    public int getSumComponent() {
        return 5;
    }
}
