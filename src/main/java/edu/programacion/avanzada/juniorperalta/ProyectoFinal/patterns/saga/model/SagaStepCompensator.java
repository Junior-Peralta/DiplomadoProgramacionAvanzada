package edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.saga.model;

public interface SagaStepCompensator {

    void handle(SagaPayLoad<T> sagaPayLoad);
}
