package com.dmi.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
public class EmployeeEntity {
    private Integer empId;
    private String firstName;
    private String email;
}
