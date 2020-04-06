package domain.addition;

public class SumTwoNumbersService implements SumTwoNumbersApi {
    private StorageGateway firstComponentSource;
    private StorageGateway secondComponentSource;

    public SumTwoNumbersService(StorageGateway firstComponentSource, StorageGateway secondComponentSource) {
        this.firstComponentSource = firstComponentSource;
        this.secondComponentSource = secondComponentSource;
    }

    public int getSumResult() {
        Sum sum = new Sum();
        sum.setFirstComponent(firstComponentSource.getSumComponent());
        sum.setSecondComponent(secondComponentSource.getSumComponent());
        sum.sumComponents();
        return sum.getSumResult();
    }
}
