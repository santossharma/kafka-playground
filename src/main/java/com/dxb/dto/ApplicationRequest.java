package com.dxb.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * Created by santoshsharma on 07 May, 2022
 */

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationRequest {
    @JsonProperty("StudentDetail")
    private StudentDTO student;

}
