package startup;

import domain.addition.SumTwoNumbersApi;

class Startup {
    public static void main(String[] args) {
        // without exception handling
        SumTwoNumbersApi sumTwoNumbersApi = CompositionRoot.build();
        int sum = sumTwoNumbersApi.getSumResult();
        System.out.println(sum);
    }
}
