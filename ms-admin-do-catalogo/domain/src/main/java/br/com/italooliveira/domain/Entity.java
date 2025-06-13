package br.com.italooliveira.domain;

import java.util.Objects;

public abstract class Entity<ID extends Identifier> {

    private final ID id;

    public Entity(ID id) {
        Objects.requireNonNull(id, "'id' should not be null.");
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Entity<?> entity = (Entity<?>) o;
        return id.equals(entity.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
