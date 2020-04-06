package adapters.persistence;

import domain.addition.StorageGateway;

/* Hit database to retrieve number */
public class SQLRepository implements StorageGateway {
    public int getSumComponent() {
        return 2;
    }
}
