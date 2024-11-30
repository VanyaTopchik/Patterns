package strategy.example;

class Context {
    private TransportStrategy transportStrategy;

    void setStrategy(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    void applyStrategy() {
        transportStrategy.transportation();
    }
}
