package com.bharath.spring.springcore.reftypes;

public class Scores {
    private Double maths;
    private Double physics;
    private Double hindi;

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public Double getPhysics() {
        return physics;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public Double getHindi() {
        return hindi;
    }

    public void setHindi(Double hindi) {
        this.hindi = hindi;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", physics=" + physics +
                ", hindi=" + hindi +
                '}';
    }
}
