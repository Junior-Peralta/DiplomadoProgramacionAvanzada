package edu.aluismarte.diplomado.model;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author aluis on 3/26/2022.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class TicketPlay {

    private String play;
    private BigDecimal amount;
}
