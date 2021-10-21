package org.framework.git.bank.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Business")
public class Business extends AbstractModel {

    private String idNational;
    private String name;
    private List<Address> addresses;
    private List<Phone> phones;

}