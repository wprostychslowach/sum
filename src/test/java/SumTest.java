import domain.addition.StorageGateway;
import domain.addition.SumTwoNumbersApi;
import domain.addition.SumTwoNumbersService;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SumTest {
    StorageGateway sumComponent = mock(StorageGateway.class);

    @Test
    public void testSum() {
        when(sumComponent.getSumComponent()).thenReturn(5);
        SumTwoNumbersApi sumTwoNumbersApi = new SumTwoNumbersService(sumComponent, sumComponent);
        assertEquals(sumTwoNumbersApi.getSumResult(), 10);
    }
}
