package domain.addition;

public class SumTwoNumbersService implements SumTwoNumbersApi {
    private StorageGateway firstComponentSource;
    private StorageGateway secondComponentSource;

    public SumTwoNumbersService(StorageGateway firstComponentSource, StorageGateway secondComponentSource) {
        this.firstComponentSource = firstComponentSource;
        this.secondComponentSource = secondComponentSource;
    }

    public int sum() {
        Sum arithmeticOperation = new Sum(firstComponentSource.getSumComponent(), secondComponentSource.getSumComponent());
        int sumResult = arithmeticOperation.sum();
        return sumResult;
    }
}
