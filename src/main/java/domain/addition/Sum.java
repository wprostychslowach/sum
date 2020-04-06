package domain.addition;

class Sum {
    private final int firstComponent;
    private final int secondComponent;

    Sum(int firstComponent, int secondComponent) {
        this.firstComponent = firstComponent;
        this.secondComponent = secondComponent;
    }

    int sum() {
        return firstComponent + secondComponent;
    }
}
