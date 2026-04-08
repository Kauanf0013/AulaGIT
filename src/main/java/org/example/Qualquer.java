package org.example;

import java.util.Objects;

public class Qualquer {

    int mistoQuente;

    public Qualquer(int mistoQuente) {
        this.mistoQuente = mistoQuente;
    }

    public int getMistoQuente() {
        return mistoQuente;
    }

    public void setMistoQuente(int mistoQuente) {
        this.mistoQuente = mistoQuente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Qualquer qualquer = (Qualquer) o;
        return mistoQuente == qualquer.mistoQuente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mistoQuente);
    }

    @Override
    public String toString() {
        return "Qualquer{" +
                "mistoQuente=" + mistoQuente +
                '}';
    }
}
