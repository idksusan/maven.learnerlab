package com.github.curriculeon;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
