package com.aluracursos.desafio.service;

public interface IConvierteDatos {
    // <T> T -> significa que se esta trabajando con tipos de datos genericos
    <T> T obtenerDatos(String json, Class<T> clase);
}
