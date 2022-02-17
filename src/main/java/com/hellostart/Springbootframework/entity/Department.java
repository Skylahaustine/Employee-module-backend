package com.hellostart.Springbootframework.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Department {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
@NotBlank(message = "Input Department Name" )
/*@Length(max= 5, min= 1)
@Email
@Positive

 */


    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}