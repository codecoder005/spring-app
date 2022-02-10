package com.dmi.model;

import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserEntity {
    private String userId;
    private String email;
    private String authString;
}
