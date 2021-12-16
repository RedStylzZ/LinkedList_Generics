package model;

import java.util.Objects;

public class Generic {

    private final String name;

    public Generic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Generic generic = (Generic) o;
        return Objects.equals(name, generic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
