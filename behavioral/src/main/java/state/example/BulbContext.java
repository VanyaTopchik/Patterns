package state.example;

class BulbContext {

    private State state = StateProvider.getOffState();

    void performAction() {
        this.setState(state.action());
    }

    private void setState(State state) {
        this.state = state;
    }
}
