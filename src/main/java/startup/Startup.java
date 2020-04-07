package startup;

import domain.addition.SumTwoNumbersApi;

class Startup {
    public static void main(String[] args) {
        // without exception handling
        SumTwoNumbersApi sumTwoNumbersApi = CompositionRoot.build();
        int sum = sumTwoNumbersApi.sum();
        System.out.println(sum);
    }
}
