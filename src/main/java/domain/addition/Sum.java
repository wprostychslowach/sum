package domain.addition;

class Sum {
    private int firstComponent;
    private int secondComponent;
    private int sum;

    void setFirstComponent(int firstComponent) {
        this.firstComponent = firstComponent;
    }

    void setSecondComponent(int secondComponent) {
        this.secondComponent = secondComponent;
    }

    void sumComponents() {
        sum = firstComponent + secondComponent;
    }

    int getSumResult() {
        return sum;
    }

}
