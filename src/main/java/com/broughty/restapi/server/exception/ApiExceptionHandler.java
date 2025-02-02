package com.broughty.restapi.server.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * Handle any errors in a generic way - may not need all these as they all do the same thing
 * Need to think about how much info we expose back to client
 */
@RestControllerAdvice
public class ApiExceptionHandler {


  private static final Logger log = LoggerFactory.getLogger(ApiExceptionHandler.class);

  @ExceptionHandler(value = ResourceNotFoundException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public com.broughty.restapi.model.Error resourceNotFoundException(ResourceNotFoundException ex) {
    return new com.broughty.restapi.model.Error().status(HttpStatus.NOT_FOUND.value()).error(ex.getMessage());
  }

  @ExceptionHandler(value = EmptyResultDataAccessException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public com.broughty.restapi.model.Error resourceEmptyException(ResourceNotFoundException ex) {
    log.info("in resourceEmptyException with {}", ex, ex);
    return new com.broughty.restapi.model.Error().status(HttpStatus.NOT_FOUND.value()).error(ex.getMessage());
  }

  @ExceptionHandler(value = NullPointerException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public com.broughty.restapi.model.Error classNotFoundException(ClassNotFoundException ex) {
    return new com.broughty.restapi.model.Error().status(HttpStatus.INTERNAL_SERVER_ERROR.value()).error(ex.getMessage());
  }

  @ExceptionHandler(value = Exception.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public com.broughty.restapi.model.Error invocationTargetException(InvocationTargetException ex) {
    return new com.broughty.restapi.model.Error().status(HttpStatus.INTERNAL_SERVER_ERROR.value()).error(ex.getMessage());
  }

  @ExceptionHandler(value = SQLException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public com.broughty.restapi.model.Error sqlException(InvocationTargetException ex) {
    return new com.broughty.restapi.model.Error().status(HttpStatus.INTERNAL_SERVER_ERROR.value()).error(ex.getMessage());
  }

}