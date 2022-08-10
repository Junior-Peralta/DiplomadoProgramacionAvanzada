package edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.saga.model;

public interface SagaStep {

    String getName();

    SagaStepHandler<T> getHandler();

    SagaStepCompensator<T> getCompensator();
}
