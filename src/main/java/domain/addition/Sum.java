package domain.addition;

class Sum {
    private int firstComponent;
    private int secondComponent;
    private int sumResult;

    Sum(int firstComponent, int secondComponent) {
        this.firstComponent = firstComponent;
        this.secondComponent = secondComponent;
    }

    void sum() {
        sumResult = firstComponent + secondComponent;
    }

    int getSumResult() {
        return sumResult;
    }

}
