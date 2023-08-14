package com.metamorphosis.kafkajsonsolution.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Prof {
    Long id;
    String name;
}
