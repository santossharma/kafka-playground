package com.dxb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * Created by santoshsharma on 07 May, 2022
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Long studentId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private CourseDTO course;
}
