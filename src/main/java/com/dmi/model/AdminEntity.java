package com.dmi.model;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminEntity {
    private String adminId;
    private String auth_token;
}
