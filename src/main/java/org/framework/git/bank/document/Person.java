package org.framework.git.bank.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Person")
public class Person extends AbstractModel {

    private String idNational;
    private String name;
    private String gender;
    private Address addresses;
    private Phone phones;

}