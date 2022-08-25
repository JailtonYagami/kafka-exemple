package br.com.springkafka.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class PeopleDTO {

    private String name;
    private String cpf;

    private List<String> books;
}
