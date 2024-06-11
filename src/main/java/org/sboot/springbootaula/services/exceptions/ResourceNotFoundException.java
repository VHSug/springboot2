package org.sboot.springbootaula.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id){
        super("Resourece not found. Id" + id);
    }

}
