package com.devsuperior.dscommerce.dto;

import com.phsoftware.dscommerce.dto.CustomErrorDTO;
import com.phsoftware.dscommerce.dto.FieldMessageDTO;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomErrorDTO {
    private List<FieldMessageDTO> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessageDTO> getErrors() {
        return errors;
    }

    public void addError(String fieldName,String message){
        errors.removeIf(x -> x.getFieldName().equals(fieldName));
        errors.add(new FieldMessageDTO(fieldName,message));
    }
}