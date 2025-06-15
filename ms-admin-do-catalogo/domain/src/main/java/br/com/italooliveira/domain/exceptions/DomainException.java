package br.com.italooliveira.domain.exceptions;

import br.com.italooliveira.domain.validation.NewError;

import java.util.List;

public class DomainException extends NoStackTraceException {

    private final List<NewError> errors;

    private DomainException(final String aMessage, List<NewError> anErrors) {
        super(aMessage);
        this.errors = anErrors;
    }

    public static  DomainException with(final NewError anErrors) {
        return new DomainException(anErrors.message(), List.of(anErrors));
    }

    public static  DomainException with(final List<NewError> anErrors) {
        return new DomainException("", anErrors);
    }

    public List<NewError> getErrors() {
        return errors;
    }
}
