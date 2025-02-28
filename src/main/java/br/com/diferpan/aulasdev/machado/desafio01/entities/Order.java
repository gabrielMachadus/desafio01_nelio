package br.com.diferpan.aulasdev.machado.desafio01.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
 private int code;
 private double basic;
 private double discount;
}
