package memento.example;

import java.time.LocalDateTime;

public record Memento(State state, LocalDateTime createdAt) {
    public Memento(State state, LocalDateTime createdAt) {
        this.state = new State(state);
        this.createdAt = createdAt;
    }
}
