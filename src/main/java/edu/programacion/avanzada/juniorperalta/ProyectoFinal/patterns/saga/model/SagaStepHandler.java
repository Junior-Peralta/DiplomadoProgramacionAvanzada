package edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.saga.model;

public interface SagaStepHandler {

    void handle(SagaPayLoad<T> sagaPayLoad);
}
