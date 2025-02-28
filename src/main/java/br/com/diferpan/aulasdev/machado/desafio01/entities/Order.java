package br.com.diferpan.aulasdev.machado.desafio01.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
 private Integer code;
 private Double basic;
 private Double discount;
}
