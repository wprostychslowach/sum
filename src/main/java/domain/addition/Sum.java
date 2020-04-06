package domain.addition;

class Sum {
    private int firstComponent;
    private int secondComponent;
    private int sum;

    Sum(int firstComponent, int secondComponent) {
        this.firstComponent = firstComponent;
        this.secondComponent = secondComponent;
    }

    void sumComponents() {
        sum = firstComponent + secondComponent;
    }

    int getSumResult() {
        return sum;
    }

}
